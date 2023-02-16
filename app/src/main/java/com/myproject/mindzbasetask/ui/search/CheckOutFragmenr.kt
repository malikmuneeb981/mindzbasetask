package com.myproject.mindzbasetask.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myproject.mindzbasetask.R
import com.myproject.mindzbasetask.databinding.FragmentCheckOutBinding
import com.myproject.mindzbasetask.databinding.FragmentCheckOutFragmenrBinding
import com.myproject.mindzbasetask.databinding.FragmentHomeBinding


class CheckOutFragmenr : Fragment() {

    private var _binding: FragmentCheckOutFragmenrBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCheckOutFragmenrBinding.inflate(inflater, container, false)
        val root: View = binding.root







        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}