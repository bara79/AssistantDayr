package com.bara_x.assistantdayr.transport.adapterViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bara_x.assistantdayr.transport.screen.motocycle.*
import com.bara_x.assistantdayr.transport.screen.zaz.ZazFourFragment
import com.bara_x.assistantdayr.transport.screen.zaz.ZazOneFragment
import com.bara_x.assistantdayr.transport.screen.zaz.ZazThreeFragment
import com.bara_x.assistantdayr.transport.screen.zaz.ZazTwoFragment

class PagerAdapterZaz(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 4

    }

    override fun createFragment(position: Int): Fragment {

        return when(position){
            0->ZazOneFragment()
            1->ZazTwoFragment()
            2->ZazThreeFragment()
            else->ZazFourFragment()

        }

    }
}