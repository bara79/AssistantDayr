package com.bara_x.assistantdayr.medicine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.databinding.ActivityMedicineListBinding
import com.bara_x.assistantdayr.listActivity.WeaponListActivity
import com.bara_x.assistantdayr.medicine.activity.BintDescription
import com.bara_x.assistantdayr.medicine.activity.LisickaDescription
import com.bara_x.assistantdayr.medicine.activity.PodoroznikDescription
import com.bara_x.assistantdayr.transport.activity.BicycleDescription
import com.bara_x.assistantdayr.transport.activity.CartDescription
import com.bara_x.assistantdayr.transport.activity.ClassicMobileDescription
import com.bara_x.assistantdayr.transport.activity.MotocycleDescription


class MedicineListActivity : AppCompatActivity() {
    //отрисовывается экран с медициной

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Medicine>
    lateinit var imageId: Array<Int>
    lateinit var headingMedicine: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicine_list)

        //массивы с данными для заполнения
        imageId = arrayOf(

            R.drawable.bint,
            R.drawable.podoroznik,
            R.drawable.lisicka,
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
            R.drawable.bint,
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
        headingMedicine = arrayOf(

            getString(R.string.bint),
            getString(R.string.podoriznik),
            getString(R.string.lisicka),
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
        newRecyclerView = findViewById(R.id.rcViewMedicine)

        // настроил в активили
        // newRecyclerView.layoutManager = GridLayoutManager(this@TransportListActivity, 3)

        newArrayList = arrayListOf<Medicine>()
        getUserdata()

    }

    private fun getUserdata() {
        for (i in imageId.indices) {
            val medicine = Medicine(imageId[i], headingMedicine[i])
            newArrayList.add(medicine)
        }

        val adapter = rvAdapterMedicine(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : rvAdapterMedicine.onItemClickListener {

            override fun onItemClick(position: Int) {

                if (position == 0) {
                    val intent =
                        Intent(this@MedicineListActivity, BintDescription::class.java)
                    startActivity(intent)

                }
                if (position == 1) {
                    val intent =
                        Intent(this@MedicineListActivity, PodoroznikDescription::class.java)
                    startActivity(intent)

                }
                if (position == 2) {
                    val intent =
                        Intent(this@MedicineListActivity, LisickaDescription::class.java)
                    startActivity(intent)

                }
                if (position == 3) {
                    val intent =
                        Intent(this@MedicineListActivity, ClassicMobileDescription::class.java)
                    startActivity(intent)

                }
                if (position == 4) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 5) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 6) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 7) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 8) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 9) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 10) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 11) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 12) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 13) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 14) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 15) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 16) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 17) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 18) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 19) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 20) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 21) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 22) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 23) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 24) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 25) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 26) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 27) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 28) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 29) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 30) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 31) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 32) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 33) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 34) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
                if (position == 35) {
                    val intent =
                        Intent(this@MedicineListActivity, WeaponListActivity::class.java)
                    startActivity(intent)

                }
            }

        })
    }
}
