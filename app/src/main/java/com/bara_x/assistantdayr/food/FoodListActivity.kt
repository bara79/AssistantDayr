package com.bara_x.assistantdayr.food

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.listActivity.WeaponListActivity
import com.bara_x.assistantdayr.transport.Transport
import com.bara_x.assistantdayr.transport.activity.BicycleDescription
import com.bara_x.assistantdayr.transport.activity.CartDescription
import com.bara_x.assistantdayr.transport.activity.ClassicMobileDescription
import com.bara_x.assistantdayr.transport.activity.MotocycleDescription
import com.bara_x.assistantdayr.transport.activity.VazDescription
import com.bara_x.assistantdayr.transport.rvAdapterTransport


// отрисовывается экран с едой

class FoodListActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Food>
    lateinit var imageId: Array<Int>
    lateinit var headingFood: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_list)


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
        headingFood = arrayOf(

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

        newRecyclerView = findViewById(R.id.rcViewFood)

        // настроил в активили
        // newRecyclerView.layoutManager = GridLayoutManager(this@TransportListActivity, 3)


        newArrayList = arrayListOf<Food>()
        getUserdata()


    }

    private fun getUserdata() {
        for (i in imageId.indices) {
            val food = Food(imageId[i], headingFood[i])
            newArrayList.add(food)
        }


        val adapter = rvAdapterFood(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : rvAdapterFood.onItemClickListener {

            override fun onItemClick(position: Int) {
//                Toast.makeText(
//                    this@TransportListActivity,
//                    "нажали на кнопку $position",
//                    Toast.LENGTH_SHORT
//                ).show()

                if (position == 0) {
                    val intent =
                        Intent(this@FoodListActivity, CartDescription::class.java)
                    startActivity(intent)

                }
                if (position == 1) {
                    val intent =
                        Intent(this@FoodListActivity,  BicycleDescription::class.java)
                    startActivity(intent)

                }
                if (position == 2) {
                    val intent =
                        Intent(this@FoodListActivity, MotocycleDescription::class.java)
                    startActivity(intent)

                }
                if (position == 3) {
                    val intent =
                        Intent(this@FoodListActivity, ClassicMobileDescription::class.java)
                    startActivity(intent)

                }
                if (position == 4) {
                    val intent =
                        Intent(this@FoodListActivity, VazDescription::class.java)
                    startActivity(intent)

                }
                if (position == 5) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 6) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 7) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 8) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 9) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 10) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 11) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 12) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 13) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 14) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 15) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 16) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 17) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 18) {
                    val intent =
                        Intent(this@FoodListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }

            }
        })
    }


}

