package com.clghks.googlesignin

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.games.Games
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    companion object {
        val TAG = MainActivity::class.java.simpleName
        val RC_SIGN_IN = 9001
        val RC_LEADERBOARD_UI = 9004
    }

    private var signInClient: GoogleSignInClient? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val googleSignInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN)
                .requestEmail()
                .build()

        signInClient = GoogleSignIn.getClient(this, googleSignInOptions)

        sign_in_button.setOnClickListener {
            signIn()
        }

        sign_out_button.setOnClickListener {
            signOut()
        }

        game_upload.setOnClickListener {
            Games.getLeaderboardsClient(this, GoogleSignIn.getLastSignedInAccount(this)!!).submitScore(getString(R.string.leaderboard), 1337)
        }

        game_rank.setOnClickListener {
            Games.getLeaderboardsClient(this, GoogleSignIn.getLastSignedInAccount(this)!!)
                    .getLeaderboardIntent(getString(R.string.leaderboard))
                    .addOnSuccessListener { intent -> startActivityForResult(intent, RC_LEADERBOARD_UI) }
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
            val result = Auth.GoogleSignInApi.getSignInResultFromIntent(data)
            if (result.isSuccess){
                val signedInAccount = result.signInAccount
                updateUI(signedInAccount)
            } else {
                var message = result.status.statusMessage
                if (message == null || message.isEmpty()) {
                    message = getString(R.string.signin_other_error)
                }
                AlertDialog.Builder(this).setMessage(message).setNeutralButton(android.R.string.ok, null).show()
            }
        }
    }

    private fun updateUI(user: GoogleSignInAccount?) {
        hideProgressDialog()
        if (user != null) {
            login_user_email.text = getString(R.string.google_status_fmt, user.email)

            sign_in_button.visibility = View.GONE
            sign_button_layout.visibility = View.VISIBLE
        } else {
            login_user_email.text = getString(R.string.signed_out)

            sign_in_button.visibility = View.VISIBLE
            sign_button_layout.visibility = View.GONE
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
