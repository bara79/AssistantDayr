package com.bara_x.assistantdayr.Transport

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.medicine.MedicineListActivity

// адаптер ресайклер вью


class rvAdapterTransport(val transportList: ArrayList<Transport>) :
    RecyclerView.Adapter<rvAdapterTransport.TransportHolder>() {

    class TransportHolder(item: View, listener: onItemClickListener) :
        RecyclerView.ViewHolder(item) {

        /*  val textView6 : TextView = itemView.findViewById(R.id.textView6)
         *  рослушивание кнопки в ресайкл вью
         *  оба ментода применимы
         */

        val ivTransport = itemView.findViewById<ImageView>(R.id.ivTransportItem)
        val tvTransport = itemView.findViewById<TextView>(R.id.tvTransportItem)

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