package com.feryel.bllocchallenge

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class NotificationViewModel : ViewModel() {
    private val notifList: MutableLiveData<Queue<NotificationData>> by lazy {
        MutableLiveData<Queue<NotificationData>>().also {
            addNotif()
        }
    }
    private val notificationListener = NotificationListener()

    fun addNotif() {
        notifList.value?.let {
            if (it.size > NOTIFICATION_NUMBER) {
                it.remove()
            }
            it.add(notificationListener.newNotif)
        }
    }
    fun getNotifs(): LiveData<Queue<NotificationData>> {
        return notifList
    }


    companion object {
        const val NOTIFICATION_NUMBER = 20
    }
}
