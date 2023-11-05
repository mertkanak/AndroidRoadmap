package com.example.foregroundservices

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

class RunninpApp : Application() {
    override fun onCreate() {
        super.onCreate()
            val channel = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationChannel(
                    "running_channel",
                    "Running Notifications",
                    NotificationManager.IMPORTANCE_HIGH
                )
            } else {
                TODO("VERSION.SDK_INT < O")
            }
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
    }
}