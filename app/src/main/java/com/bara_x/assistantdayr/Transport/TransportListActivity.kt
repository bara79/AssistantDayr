package com.bara_x.assistantdayr.Transport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R
import com.google.android.material.navigation.NavigationView

// отрисовывается экран с транспортом

class TransportListActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Transport>
    lateinit var imageId: Array<Int>
    lateinit var headingTransport: Array<String>
    lateinit var description: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transport_list)


//массивы с данными для заполнения
        imageId = arrayOf(

            R.drawable.telega,
            R.drawable.bicycle,
            R.drawable.moto,
            R.drawable.classic_mobile,
            R.drawable.vaz2101,
            R.drawable.gaz24,
            R.drawable.uaz,
            R.drawable.uaz452,
            R.drawable.gaz66,
            R.drawable.zil130,
            R.drawable.kamaz,
            R.drawable.bav485,
            R.drawable.kraz255,
            R.drawable.mi8,
            R.drawable.polar_atv,
            R.drawable.raft,
            R.drawable.motorboat,
            R.drawable.belaz


        )
        headingTransport = arrayOf(

            getString(R.string.telega),
            getString(R.string.bicycle),
            getString(R.string.motocycle),
            getString(R.string.clasic_mobile),
            getString(R.string.vaz2101),
            getString(R.string.gaz24),
            getString(R.string.uaz),
            getString(R.string.uaz452),
            getString(R.string.gaz66),
            getString(R.string.zil130),
            getString(R.string.kamaz),
            getString(R.string.bav485),
            getString(R.string.kraz255),
            getString(R.string.mi8),
            getString(R.string.polar_atv),
            getString(R.string.raft),
            getString(R.string.motorboat),
            getString(R.string.belaz)

        )
        /*      description = arrayOf(
                  getString(R.string.telega_discription),
                  getString(R.string.bicycle_discription),
                  getString(R.string.motocycle_discription),
                  getString(R.string.clasic_mobile_discription),
                  getString(R.string.vaz2101_discription),
                  getString(R.string.gaz24_discription),
                  getString(R.string.uaz_discription),
                  getString(R.string.uaz452_discription),
                  getString(R.string.gaz66_discription),
                  getString(R.string.zil130_discription),
                  getString(R.string.kamaz_discription),
                  getString(R.string.bav485_discription),
                  getString(R.string.kraz255_discription),
                  getString(R.string.mi8_discription),
                  getString(R.string.polar_atv_discription),
                  getString(R.string.raft_discription),
                  getString(R.string.motorboat_discription),
                  getString(R.string.belaz_discription)
              )

         */

        newRecyclerView = findViewById(R.id.rcViewTransport)

      // настроил в активили
       // newRecyclerView.layoutManager = GridLayoutManager(this@TransportListActivity, 3)



        newArrayList = arrayListOf<Transport>()
        getUserdata()


    }

    private fun getUserdata() {
        for (i in imageId.indices) {
            val transport = Transport(imageId[i], headingTransport[i])
            newArrayList.add(transport)
        }


        val adapter = rvAdapterTransport(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : rvAdapterTransport.onItemClickListener {

            override fun onItemClick(position: Int) {
//                Toast.makeText(
//                    this@TransportListActivity,
//                    "нажали на кнопку $position",
//                    Toast.LENGTH_SHORT
//                ).show()
/*
               // переход на экран с описанием транспорт открытие нового активити в данном случае  descriptionactivitytransport

                  val intent =
                      Intent(this@TransportListActivity, DescriptionActivityTransport::class.java)

               //  передаем на descriptionactivitytransport описание, картинку и заголовок
                  intent.putExtra("heading", newArrayList[position].title)
                  intent.putExtra("imageId", newArrayList[position].imageId)
                  intent.putExtra("description", description[position])

                 // стартуем данное активити
                  startActivity(intent)
*/
            }
        })
    }

}


