package com.bara_x.assistantdayr.quests

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R

// адаптер ресайклер вью


class rvAdapterQuest(val questList: ArrayList<Quest>) :
    RecyclerView.Adapter<rvAdapterQuest.QuestHolder>() {

    class QuestHolder(item: View, listener: onItemClickListener) :
        RecyclerView.ViewHolder(item) {

        /*  val textView6 : TextView = itemView.findViewById(R.id.textView6)
         *  рослушивание кнопки в ресайкл вью
         *  оба ментода применимы
         */

        val ivQuest = itemView.findViewById<ImageView>(R.id.ivQuestItem)
        val tvQuest = itemView.findViewById<TextView>(R.id.tvQuestItem)

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.quest_item, parent, false)
        return QuestHolder(itemView, mListener)

    }

    override fun onBindViewHolder(holder: QuestHolder, position: Int) {

        val currentItem = questList[position]
        holder.ivQuest.setImageResource(currentItem.imageId)
        holder.tvQuest.text = currentItem.title


    }

    override fun getItemCount(): Int {

        return questList.size

    }


}