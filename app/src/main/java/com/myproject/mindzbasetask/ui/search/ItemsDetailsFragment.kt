package com.myproject.mindzbasetask.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.myproject.mindzbasetask.R
import com.myproject.mindzbasetask.databinding.FragmentHomeBinding
import com.myproject.mindzbasetask.databinding.FragmentItemsDetailsBinding


class ItemsDetailsFragment : Fragment() {

    private var _binding: FragmentItemsDetailsBinding? = null
    lateinit var navController: NavController
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    val args:ItemsDetailsFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentItemsDetailsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        navController=findNavController()
        val image=args.itemid
        val itemname=args.itemname
        val itemprice=args.itemprice


        Glide.with(requireActivity()).load(image).into(binding.itemimage)
        binding.tvitemname.text=itemname
        binding.tvprice.text=itemprice
        binding.btnekle.setOnClickListener {
            val action=ItemsDetailsFragmentDirections.actionItemsDetailsFragmentToCheckOutFragmenr()
            navController.navigate(action)
        }





        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}