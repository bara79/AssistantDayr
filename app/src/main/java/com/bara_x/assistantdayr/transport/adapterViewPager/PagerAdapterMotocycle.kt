package com.bara_x.assistantdayr.transport.adapterViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bara_x.assistantdayr.transport.screen.motocycle.*

class PagerAdapterMotocycle (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->MotocycleOneFragment()
            1->MotocycleTwoFragment()
            3->MotocycleThreeFragment()
            4->MotocycleFourFragment()
            else->MotocycleFiveFragment()
        }
    }
}