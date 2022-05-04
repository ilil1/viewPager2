package com.project.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.project.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPagerviewBinding.adapter = ViewPagerAdapter(getItemList()) // 어댑터 생성
        binding.viewPagerviewBinding.orientation = ViewPager2.ORIENTATION_HORIZONTAL // 방향을 가로로
    }

    // 뷰 페이저에 들어갈 아이템
    private fun getItemList(): ArrayList<Int> {
        return arrayListOf(R.drawable.filter_1, R.drawable.filter_2, R.drawable.filter_3)
    }
}