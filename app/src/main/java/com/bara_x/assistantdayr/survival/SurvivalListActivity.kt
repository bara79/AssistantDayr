package com.bara_x.assistantdayr.survival

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.listActivity.WeaponListActivity
import com.bara_x.assistantdayr.transport.activity.BicycleDescription
import com.bara_x.assistantdayr.transport.activity.CartDescription
import com.bara_x.assistantdayr.transport.activity.MotocycleDescription

class SurvivalListActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Survival>
    lateinit var imageIdSurvival: Array<Int>
    lateinit var headingSurvival: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survival_list)

        imageIdSurvival = arrayOf(
            R.drawable.telega,
            R.drawable.bicycle,
            R.drawable.moto,
            R.drawable.classic_mobile,
            R.drawable.vaz2101,
            R.drawable.gaz24

        )


        headingSurvival= arrayOf(
            getString(R.string.kraz255),
            getString(R.string.mi8),
            getString(R.string.polar_atv),
            getString(R.string.raft),
            getString(R.string.motorboat),
            getString(R.string.belaz)
        )


        newRecyclerView = findViewById(R.id.rcViewSurvival)


        newArrayList = arrayListOf<Survival>()
        getUserdata()


    }

    private fun getUserdata() {
        for (i in imageIdSurvival.indices) {
            val survival = Survival(imageIdSurvival[i], headingSurvival[i])
            newArrayList.add(survival)
        }


        val adapter = RvAdapterSurvival(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setItemOnClickListener(object : RvAdapterSurvival.onItemClickListener {

            override fun onItemClick(position: Int) {

                Toast.makeText(
                    this@SurvivalListActivity,
                    "нажали на кнопку $position",
                    Toast.LENGTH_SHORT
               ).show()


                if (position == 0) {
                    val intent =
                        Intent(this@SurvivalListActivity, CartDescription::class.java)
                    startActivity(intent)

                }
                if (position == 1) {
                    val intent =
                        Intent(this@SurvivalListActivity, BicycleDescription::class.java)
                    startActivity(intent)

                }
                if (position == 2) {
                    val intent =
                        Intent(this@SurvivalListActivity, MotocycleDescription::class.java)
                    startActivity(intent)

                }
                if (position == 3) {
                    val intent =
                        Intent(this@SurvivalListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 4) {
                    val intent =
                        Intent(this@SurvivalListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 5) {
                    val intent =
                        Intent(this@SurvivalListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
            }
        })

    }


}