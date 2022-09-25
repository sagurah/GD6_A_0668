package com.example.gd6_a_0668

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class NotificationReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent) {
        val message = p1.getStringExtra("toastMessage")
        Toast.makeText(p0,message,Toast.LENGTH_LONG).show()
    }
}