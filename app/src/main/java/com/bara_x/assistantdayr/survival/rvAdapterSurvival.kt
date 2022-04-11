package com.bara_x.assistantdayr.survival

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R

class RvAdapterSurvival(val survivalList: ArrayList<Survival>) :
    RecyclerView.Adapter<RvAdapterSurvival.SurvivalHolder>() {

    class SurvivalHolder(item: View, listener: onItemClickListener) :
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

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int ): SurvivalHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.survival_item, parent, false)
        return SurvivalHolder(itemView, mListener)

    }

    override fun onBindViewHolder(holder: SurvivalHolder, position: Int) {

        val currentItem = survivalList[position]
        holder.ivSurvival.setImageResource(currentItem.survivalImageId)
        holder.tvSurvival.text = currentItem.survivalTitle


    }

    override fun getItemCount(): Int {

        return survivalList.size

    }




}