package com.bara_x.assistantdayr.medicine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewbinding.ViewBinding
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.databinding.ActivityMainBinding
import com.bara_x.assistantdayr.databinding.ActivityMedicineListBinding


class MedicineListActivity : AppCompatActivity() {
    lateinit var binding: ActivityMedicineListBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMedicineListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}