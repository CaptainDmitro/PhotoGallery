package com.example.photogallery

import android.app.Activity
import android.app.Notification
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.NotificationManagerCompat

private const val TAG = "NotificationReceiver"

class NotificationReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        Log.i(TAG, "result: $resultCode")
        if (resultCode != Activity.RESULT_OK) {
            return
        }

        val requstCode = p1?.getIntExtra(PollWorker.REQUEST_CODE, 0)
        val notification: Notification? = p1?.getParcelableExtra(PollWorker.NOTIFICATION)
        val notificationManager = NotificationManagerCompat.from(p0!!)
        notificationManager.notify(requstCode!!, notification!!)
    }
}