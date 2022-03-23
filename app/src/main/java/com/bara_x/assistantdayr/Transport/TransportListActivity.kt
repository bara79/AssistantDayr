package com.bara_x.assistantdayr.Transport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R

class TransportListActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Transport>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var news : Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transport_list)



        imageId = arrayOf(

            R.drawable.broken_bicycle
//            R.drawable.bicycle,
//            R.drawable.bicycle_cart,
//            R.drawable.motocart_broken,
//            R.drawable.motocart,
//            R.drawable.broken_moto,
//            R.drawable.moto,
//            R.drawable.disassemble_moto
        )
        heading = arrayOf(
            "Сломанный велосипед"
//            "Велосипед",
//            "Велосипед с тележкой",
//            "Сломаная мототележка",
//            "Мототележка",
//            "Сломаный мотоцикл",
//            "Мотоцикл",
//            "Разобранный мотоцикл"
            // для перевода строковых значений
            // getString(R.string.moto )
        )

        news = arrayOf(
        getString(R.string.moto)

        )

        newRecyclerView = findViewById(R.id.rcViewTransport)
        newRecyclerView.layoutManager = GridLayoutManager(this@TransportListActivity, 3)



        newArrayList = arrayListOf<Transport>()
        getUserdata()


    }

    private fun getUserdata() {
        for (i in imageId.indices) {
            val transport = Transport(imageId[i], heading[i])
            newArrayList.add(transport)
        }


        val adapter = AdapterTransport(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : AdapterTransport.onItemClickListener {

            override fun onItemClick(position: Int) {


                //Toast.makeText(this@TransportListActivity,"нажали на кнопку $position", Toast.LENGTH_SHORT).show()

                val intent  = Intent (this@TransportListActivity, DescriptionActivityTransport::class.java)
                intent.putExtra("heading",newArrayList[position].title)
                intent.putExtra("imageId",newArrayList[position].imageId)
                intent.putExtra("news",news[position])
                startActivity(intent)

            }


        })


    }
}


