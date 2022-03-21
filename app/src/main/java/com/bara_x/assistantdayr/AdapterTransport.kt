package com.bara_x.assistantdayr

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterTransport(val transportList: ArrayList<Transport>) :
    RecyclerView.Adapter<AdapterTransport.TransportHolder>() {

    class TransportHolder(item: View, listener: onItemClickListener) : RecyclerView.ViewHolder(item) {

        val ivTransport: ImageView = itemView.findViewById(R.id.ivTransportItem)
        val tvTransport = itemView.findViewById<TextView>(R.id.tvTransportItem)
        //  val textView6 : TextView = itemView.findViewById(R.id.textView6)

    init {

        itemView.setOnClickListener {

            listener.onItemClick(absoluteAdapterPosition)

        }

    }

    }

    private lateinit var mListener: onItemClickListener

    interface onItemClickListener {

        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransportHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.transport_item, parent, false)
        return TransportHolder(itemView, mListener)

    }

    override fun onBindViewHolder(holder: TransportHolder, position: Int) {

        val currentItem = transportList[position]
        holder.ivTransport.setImageResource(currentItem.imageId)
        holder.tvTransport.text = currentItem.title


    }

    override fun getItemCount(): Int {

        return transportList.size

    }


}