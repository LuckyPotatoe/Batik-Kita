package com.example.batikkita.ui.scan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.batikkita.R
import com.example.batikkita.databinding.FragmentScanBinding

class ScanFragment : Fragment() {

    private lateinit var binding: FragmentScanBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScanBinding.inflate(inflater)
        return binding.root
    }
}