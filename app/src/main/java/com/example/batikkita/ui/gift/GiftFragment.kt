package com.example.batikkita.ui.gift

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.batikkita.R
import com.example.batikkita.databinding.FragmentGiftBinding

class GiftFragment : Fragment() {

    private lateinit var binding: FragmentGiftBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGiftBinding.inflate(inflater)
        return binding.root
    }
}