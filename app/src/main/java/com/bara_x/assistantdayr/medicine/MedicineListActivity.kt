package com.bara_x.assistantdayr.medicine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.databinding.ActivityMainBinding
import com.bara_x.assistantdayr.databinding.ActivityMedicineListBinding
import com.bara_x.assistantdayr.medicine.adapter.MedicineAdapter
import kotlinx.android.synthetic.main.activity_medicine_list.*


class MedicineListActivity : AppCompatActivity() {

    lateinit var binding: ActivityMedicineListBinding
    private var adapter = MedicineAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMedicineListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

    }

    private fun init() {
        rcViewMedicine.adapter = adapter

    }
}