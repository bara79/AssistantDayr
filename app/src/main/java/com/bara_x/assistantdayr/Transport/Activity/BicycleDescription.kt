package com.bara_x.assistantdayr.Transport.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.Transport.adapterViewPager.PagerAdapter
import com.bara_x.assistantdayr.databinding.ActivityBicycleDescriptionBinding

class BicycleDescription : AppCompatActivity() {

    private lateinit var binding: ActivityBicycleDescriptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBicycleDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //инициализируем вьюпейджер
        initial()


    }

    private fun initial() {
        binding.viewPagerBicycle.adapter = PagerAdapter(this)
    }
}