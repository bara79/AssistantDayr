package com.bara_x.assistantdayr.transport.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.databinding.ActivityVazDescriptionBinding
import com.bara_x.assistantdayr.transport.adapterViewPager.PagerAdapterVaz
import com.bara_x.assistantdayr.transport.adapterViewPager.PagerAdapterZaz

class VazDescription : AppCompatActivity() {

    private  lateinit var binding: ActivityVazDescriptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVazDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
        binding.viewPagerVaz.adapter = PagerAdapterVaz(this)
    }
}