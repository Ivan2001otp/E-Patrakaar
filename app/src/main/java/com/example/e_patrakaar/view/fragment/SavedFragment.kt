package com.example.e_patrakaar.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.e_patrakaar.databinding.FragmentSavedBinding

class SavedFragment : Fragment() {

    private lateinit var binding: FragmentSavedBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentSavedBinding.inflate(inflater, container, false)

        return binding.root
    }


}