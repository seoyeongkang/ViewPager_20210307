package com.tjoeun.viewpager_20210307.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tjoeun.viewpager_20210307.fragments.BirthFragment
import com.tjoeun.viewpager_20210307.fragments.DescFragment
import com.tjoeun.viewpager_20210307.fragments.NickFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "닉네임"
            1 -> "생년월일"
            else -> "소개문구"
        }
    }
    
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> NickFragment()
            1 -> BirthFragment()
            else -> DescFragment()
        }
    }

}