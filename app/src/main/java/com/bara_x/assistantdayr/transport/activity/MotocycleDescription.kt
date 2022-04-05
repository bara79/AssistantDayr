package com.bara_x.assistantdayr.transport.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bara_x.assistantdayr.databinding.ActivityMotocycleDescriptionBinding
import com.bara_x.assistantdayr.transport.adapterViewPager.PagerAdapterMotocycle

class MotocycleDescription : AppCompatActivity() {

    private lateinit var binding: ActivityMotocycleDescriptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMotocycleDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
       binding.viewPagerMotocycle.adapter = PagerAdapterMotocycle(this)
    }
}