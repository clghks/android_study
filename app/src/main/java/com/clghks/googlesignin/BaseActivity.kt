package com.clghks.googlesignin

import android.support.v7.app.AppCompatActivity
import android.app.ProgressDialog
import android.content.Context
import android.support.annotation.VisibleForTesting
import android.content.Context.INPUT_METHOD_SERVICE
import android.view.View
import android.view.inputmethod.InputMethodManager


/**
 * Created by chihwan on 2018. 5. 13..
 */
open class BaseActivity : AppCompatActivity() {
    @VisibleForTesting
    private var mProgressDialog: ProgressDialog? = null

    fun showProgressDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = ProgressDialog(this)
            mProgressDialog?.setMessage("Loading...")
            mProgressDialog?.isIndeterminate = true
        }

        mProgressDialog?.show()
    }

    fun hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog?.isShowing!!) {
            mProgressDialog?.dismiss()
        }
    }

    fun hideKeyboard(view: View) {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        if (imm != null) {
            imm!!.hideSoftInputFromWindow(view.getWindowToken(), 0)
        }
    }

    public override fun onStop() {
        super.onStop()
        hideProgressDialog()
    }
}