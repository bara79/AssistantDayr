package com.bara_x.assistantdayr.medicine.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.databinding.TransportItemBinding
import com.bara_x.assistantdayr.medicine.model.MedicineModel
import kotlinx.android.synthetic.main.transport_item.view.*

class MedicineAdapter : RecyclerView.Adapter<MedicineAdapter.MedicineViewHolder>() {

    val medicineList = ArrayList<MedicineModel>()

    class MedicineViewHolder(item: View) : RecyclerView.ViewHolder(item) {


        val binding = TransportItemBinding.bind(item)

        fun bind(medicineModel: MedicineModel) = with(binding){
            ivTransportItem.setImageResource(medicineModel.image)
            tvTransportItem.text = medicineModel.heading
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicineViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.transport_item,parent,false)
        return MedicineViewHolder(view)
    }

    override fun onBindViewHolder(holder: MedicineViewHolder, position: Int) {
        
        holder.bind(medicineList[position])
    }

    override fun getItemCount(): Int {
       return medicineList.size
    }

}


