package com.bara_x.assistantdayr.transport.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.databinding.ActivityClassicMobileBinding
import com.bara_x.assistantdayr.transport.adapterViewPager.PagerAdapterZaz

class ClassicMobileDescription : AppCompatActivity() {

    private lateinit var binding: ActivityClassicMobileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClassicMobileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial(){
        binding.viewPagerZaz.adapter = PagerAdapterZaz(this)
    }
}