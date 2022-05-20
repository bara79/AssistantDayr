package com.bara_x.assistantdayr.quests.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.databinding.ActivityVpoiskahIstiniBinding
import com.bara_x.assistantdayr.quests.adapterViewPager.PagerAdapterVpoiskahIstini

class VPoiskahIstini : AppCompatActivity() {

    private lateinit var binding: ActivityVpoiskahIstiniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVpoiskahIstiniBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
        binding.viewPagerVpoiskahIstini.adapter = PagerAdapterVpoiskahIstini(this)
    }
}