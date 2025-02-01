package com.bara_x.assistantdayr.transport.adapterViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bara_x.assistantdayr.transport.screen.vaz.VazFourFragment
import com.bara_x.assistantdayr.transport.screen.vaz.VazOneFragment
import com.bara_x.assistantdayr.transport.screen.vaz.VazThreeFragment
import com.bara_x.assistantdayr.transport.screen.vaz.VazTwoFragment

class PagerAdapterVaz(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity)  {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> VazOneFragment()
            1-> VazTwoFragment()
            2-> VazThreeFragment()
            else-> VazFourFragment()
        }
    }
}