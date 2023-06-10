package com.example.pagerandadapterpattern

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pagerandadapterpattern.databinding.Fragment4Binding

class Fragment4 : Fragment() {
    lateinit var binding: Fragment4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment4Binding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance() = Fragment4()
    }
}