package com.bara_x.assistantdayr.quests.adapterViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bara_x.assistantdayr.quests.screen.vpoiskahistini.IstinaOneFragment
import com.bara_x.assistantdayr.transport.screen.bicycle.*

class PagerAdapterVpoiskahIstini(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 1
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {

            else -> IstinaOneFragment()

        }
    }
}