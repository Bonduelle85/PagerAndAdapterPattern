package com.example.pagerandadapterpattern

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity)  {
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

    val fragments = mutableListOf<Fragment>()

    fun addFragment(fragment: Fragment){
        fragments.add(fragment)
    }
}