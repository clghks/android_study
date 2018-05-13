package com.clghks.googlesignin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    companion object {
        val TAG = MainActivity::class.java.simpleName
        val RC_SIGN_IN = 9001
    }

    private var signInClient: GoogleSignInClient? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build()

        signInClient = GoogleSignIn.getClient(this, gso)

        sign_in_button.setOnClickListener {
            signIn()
        }

        sign_out_button.setOnClickListener {
            signOut()
        }
    }

    override fun onStart() {
        super.onStart()
        signInSilently()
    }

    private fun signIn() {
        startActivityForResult(signInClient?.signInIntent, RC_SIGN_IN)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode === RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)
                updateUI(account)
            } catch (e: ApiException) {
                // Google Sign In failed, update UI appropriately
                Log.w(TAG, "Google sign in failed", e)
                updateUI(null)
            }
        }
    }

    private fun updateUI(user: GoogleSignInAccount?) {
        hideProgressDialog()
        if (user != null) {
            login_user_email.text = getString(R.string.google_status_fmt, user.email)

            sign_in_button.visibility = View.GONE
            sign_out_button.visibility = View.VISIBLE
        } else {
            login_user_email.text = getString(R.string.signed_out)

            sign_in_button.visibility = View.VISIBLE
            sign_out_button.visibility = View.GONE
        }
    }

    private fun signOut() {
        // Google sign out
        signInClient?.signOut()?.addOnCompleteListener(this) { updateUI(null) }
    }

    private fun signInSilently() {
        showProgressDialog()
        signInClient?.silentSignIn()?.addOnCompleteListener(this) { task ->
            updateUI(if (task.isSuccessful) task.result else null)
            hideProgressDialog()
        }
    }
}
