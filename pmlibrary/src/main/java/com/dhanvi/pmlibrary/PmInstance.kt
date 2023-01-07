package com.dhanvi.pmlibrary

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.IBinder
import android.util.Log
import android.widget.Toast

class PmInstance(private val context: Context) {

    fun showToast() {
        Toast.makeText(context, "This is a new toast", Toast.LENGTH_SHORT).show()
    }

}