package com.example.services

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager

class My_Application:Application() {

    override fun onCreate() {

        super.onCreate()

        val channel = NotificationChannel(
            "channel_id",
            "My Foreground Service Notification Channel",
            NotificationManager.IMPORTANCE_DEFAULT

        )

        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)

    }
}