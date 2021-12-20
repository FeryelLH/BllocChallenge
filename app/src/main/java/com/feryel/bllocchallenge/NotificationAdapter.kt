package com.feryel.bllocchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotificationAdapter(val notificationList: Array<NotificationData>) : RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {

    class NotificationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView = itemView.findViewById<TextView>(R.id.titleText)
        val contentTextView = itemView.findViewById<TextView>(R.id.contentText)
        val appIconImgView = itemView.findViewById<ImageView>(R.id.appIconImageView)

        fun bind(notification: NotificationData) {
            titleTextView.text = notification.title
            contentTextView.text = notification.content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.notification_item, parent, false)

        return NotificationViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        holder.bind(notificationList[position])
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }
}
