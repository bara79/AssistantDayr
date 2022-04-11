package com.bara_x.assistantdayr.medicine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bara_x.assistantdayr.databinding.ActivityMedicineListBinding
import kotlinx.android.synthetic.main.activity_medicine_list.*


class MedicineListActivity : AppCompatActivity() {

    lateinit var binding: ActivityMedicineListBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMedicineListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

    }

    private fun init() {


    }
}