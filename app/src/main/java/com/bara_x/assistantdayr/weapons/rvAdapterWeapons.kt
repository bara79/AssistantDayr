package com.bara_x.assistantdayr.weapons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R

// адаптер ресайклер вью


class rvAdapterWeapons(val transportList: ArrayList<Weapon>) :
    RecyclerView.Adapter<rvAdapterWeapons.WeaponHolder>() {

    class WeaponHolder(item: View, listener: onItemClickListener) :
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeaponHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.transport_item, parent, false)
        return WeaponHolder(itemView, mListener)

    }

    override fun onBindViewHolder(holder: WeaponHolder, position: Int) {

        val currentItem = transportList[position]
        holder.ivTransport.setImageResource(currentItem.imageId)
        holder.tvTransport.text = currentItem.title


    }

    override fun getItemCount(): Int {

        return transportList.size

    }


}