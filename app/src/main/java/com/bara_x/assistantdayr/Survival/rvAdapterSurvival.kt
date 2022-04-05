package com.bara_x.assistantdayr.Survival

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.transport.rvAdapterTransport

class rvAdapterSurvival(val survivalList: ArrayList<Survival>) :
    RecyclerView.Adapter<rvAdapterSurvival.SurvivalHolder>() {

    class SurvivalHolder(item: View, listener: rvAdapterTransport.onItemClickListener) :
        RecyclerView.ViewHolder(item) {


        val ivSurvival = itemView.findViewById<ImageView>(R.id.ivSurvivalItem)
        val tvSurvival = itemView.findViewById<TextView>(R.id.tvSurvivalItem)

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

    fun setItemOnClickListener(listener: onItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): rvAdapterSurvival.SurvivalHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.survival_item, parent, false)
        return rvAdapterSurvival.SurvivalHolder(itemView, mListener)

    }

    override fun onBindViewHolder(holder: rvAdapterSurvival.SurvivalHolder, position: Int) {

        val currentItem = SurvivalList[position]
        holder.ivSurvival.setImageResource(currentItem.imageId)
        holder.tvSurvival.text = currentItem.title


    }

    override fun getItemCount(): Int {

        return SurvivalList.size

    }


}