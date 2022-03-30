package com.bara_x.assistantdayr.transport.adapterViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bara_x.assistantdayr.transport.screen.BicycleFirstFragment
import com.bara_x.assistantdayr.transport.screen.BicycleTheereFragment
import com.bara_x.assistantdayr.transport.screen.BicycleTooFragment

class PagerAdapter (fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
       return 3
    }

    override fun createFragment(position: Int): Fragment {
        return  when (position){

            0->BicycleFirstFragment()
            1->BicycleTooFragment()
            else->BicycleTheereFragment()
        }

    }

}