package com.example.pagerandadapterpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pagerandadapterpattern.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MyAdapter(this)

        val fragment1 = Fragment1.newInstance()
        val fragment2 = Fragment2.newInstance()
        val fragment3 = Fragment3.newInstance()
        val fragment4 = Fragment4.newInstance()
        val fragment5 = Fragment5.newInstance()

        adapter.addFragment(fragment1)
        adapter.addFragment(fragment2)
        adapter.addFragment(fragment3)
        adapter.addFragment(fragment4)
        adapter.addFragment(fragment5)

        binding.myPager.adapter = adapter
    }
}