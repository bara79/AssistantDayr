package com.bara_x.assistantdayr.food

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.medicine.rvAdapterMedicine
import com.bara_x.assistantdayr.transport.Transport

// адаптер ресайклер вью

class rvAdapterFood(val foodList: ArrayList<Food>) :
    RecyclerView.Adapter<rvAdapterFood.FoodHolder>() {

    class FoodHolder(item: View, listener: onItemClickListener) :
        RecyclerView.ViewHolder(item) {
        val ivFood = itemView.findViewById<ImageView>(R.id.ivFoodItem)
        val tvFood = itemView.findViewById<TextView>(R.id.tvFoodItem)

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

    fun setOnItemClickListener(listener: rvAdapterFood.onItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): rvAdapterFood.FoodHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return rvAdapterFood.FoodHolder(itemView, mListener)

    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {

        val currentItem = foodList[position]
        holder.ivFood.setImageResource(currentItem.imageId)
        holder.tvFood.text = currentItem.title


    }

    override fun getItemCount(): Int {

        return foodList.size

    }


}
