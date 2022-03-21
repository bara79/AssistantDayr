package com.bara_x.assistantdayr.listActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.AdapterTransport
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.Transport

class TransportListActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Transport>
    lateinit var imageId: Array<Int>
    lateinit var title: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transport_list)



        imageId = arrayOf(

            R.drawable.broken_bicycle,
            R.drawable.bicycle,
            R.drawable.bicycle_cart,
            R.drawable.motocart_broken,
            R.drawable.motocart,
            R.drawable.broken_moto,
            R.drawable.moto,
            R.drawable.disassemble_moto,

            R.drawable.broken_bicycle,
            R.drawable.bicycle,
            R.drawable.bicycle_cart,
            R.drawable.motocart_broken,
            R.drawable.motocart,
            R.drawable.broken_moto,
            R.drawable.moto,
            R.drawable.disassemble_moto
        )
        title = arrayOf(
            "Сломанный велосипед",
            "Велосипед",
            "Велосипед с тележкой",
            "Сломаная мототележка",
            "Мототележка",
            "Сломаный мотоцикл",
            "Мотоцикл",
            "Разобранный мотоцикл",

            "Сломанный велосипед",
            "Велосипед",
            "Велосипед с тележкой",
            "Сломаная мототележка",
            "Мототележка",
            "Сломаный мотоцикл",
            "Мотоцикл",
            "Разобранный мотоцикл"
            // для перевода строковых значений
            // getString(R.string.moto )
        )

        newRecyclerView = findViewById(R.id.rcViewTransport)
        newRecyclerView.layoutManager = GridLayoutManager(this@TransportListActivity, 3)



        newArrayList = arrayListOf<Transport>()
        getUserdata()


    }

    private fun getUserdata() {
        for (i in imageId.indices) {
            val transport = Transport(imageId[i], title[i])
            newArrayList.add(transport)
        }


        var adapter = AdapterTransport(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : AdapterTransport.onItemClickListener {

            override fun onItemClick(position: Int) {
                Toast.makeText(this@TransportListActivity,"нажали на кнопку $position", Toast.LENGTH_SHORT).show()


            }


        })


    }
}


