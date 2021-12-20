package com.feryel.bllocchallenge

import android.content.Intent
import android.os.IBinder
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log
import java.util.*

class NotificationListener() : NotificationListenerService() {

    var notifList: Queue<NotificationData> = LinkedList()
    var newNotif = NotificationData("", "")

    override fun onBind(intent: Intent?): IBinder? {
        return super.onBind(intent)
    }

    override fun onNotificationPosted(sbn: StatusBarNotification?, rankingMap: RankingMap?) {
        super.onNotificationPosted(sbn, rankingMap)
        val title = sbn?.notification?.extras?.getString("android.title")
        val text = sbn?.notification?.extras?.getString("android.text")
        val package_name = sbn?.packageName
        newNotif = NotificationData(title ?: "", text ?: "")
        notifList.add(newNotif)
//        Log.v("Notification title is:", title)
//        Log.v("Notification text is:", text)
//        Log.v("Notif Package Name is:", package_name)
    }

    override fun onNotificationRemoved(sbn: StatusBarNotification?) {
        super.onNotificationRemoved(sbn)
    }

    fun getNewNotification(): NotificationData {
        return newNotif
    }
}


