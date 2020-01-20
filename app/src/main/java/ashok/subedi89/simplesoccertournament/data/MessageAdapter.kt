package ashok.subedi89.simplesoccertournament.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ashok.subedi89.simplesoccertournament.R
import kotlinx.android.synthetic.main.item_message.view.*

class MessageAdapter(val messageList: ArrayList<Message>, val context: Context) :
    RecyclerView.Adapter<MessageItemViewHolder>() {
    // inflate the item view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageItemViewHolder {
        return MessageItemViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_message,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return messageList.size
    }

    override fun onBindViewHolder(holder: MessageItemViewHolder, position: Int) {
        holder.messageTV.text = messageList[position].message
        holder.senderTV.text = messageList[position].name
    }
}

class MessageItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val messageTV = view.textView_messageText
    val senderTV = view.textView_messageSender

}

