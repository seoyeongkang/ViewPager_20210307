package com.tjoeun.viewpager_20210307

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.viewpager_20210307.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    
    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()
    }

    override fun setUpEvents() {

    }

    override fun setValues() {

        mvpa = MainViewPagerAdapter(supportFragmentManager)

        mainViewPager.adapter = mvpa

//      xml에 배치하는 탭레이아웃과, 뷰페이저 연결
        tabLayout.setupWithViewPager(mainViewPager)
    }

}