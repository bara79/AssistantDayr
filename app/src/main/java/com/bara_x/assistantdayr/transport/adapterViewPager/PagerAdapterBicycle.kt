package com.bara_x.assistantdayr.transport.adapterViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bara_x.assistantdayr.transport.screen.bicycle.*

class PagerAdapterBicycle(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {

            0 -> BicycleFirstFragment()
            1 -> BicycleTooFragment()
            2 -> BicycleTheereFragment()
            3 -> MotorizedCartBrokenFragment()
            else-> MotorizedCartFragment()
        }

    }

}