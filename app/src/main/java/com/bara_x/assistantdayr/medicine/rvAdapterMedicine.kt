package com.bara_x.assistantdayr.medicine

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.transport.rvAdapterTransport

// адаптер ресайклер вью


class rvAdapterMedicine(val medicineList: ArrayList<Medicine>) :
    RecyclerView.Adapter<rvAdapterMedicine.MedicineHolder>(){

        class MedicineHolder(item: View,  listener: onItemClickListener) :
                RecyclerView.ViewHolder(item){
            val ivMedicine = itemView.findViewById<ImageView>(R.id.ivMedicineItem)
            val tvMedicine = itemView.findViewById<TextView>(R.id.tvMedicineItem)

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

    fun setOnItemClickListener(listener: rvAdapterMedicine.onItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): rvAdapterMedicine.MedicineHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.medicine_item, parent, false)
        return rvAdapterMedicine.MedicineHolder(itemView, mListener)

    }

    override fun onBindViewHolder(holder: rvAdapterMedicine.MedicineHolder, position: Int) {

        val currentItem = medicineList[position]
        holder.ivMedicine.setImageResource(currentItem.imageId)
        holder.tvMedicine.text = currentItem.title


    }

    override fun getItemCount(): Int {

        return medicineList.size

    }


}