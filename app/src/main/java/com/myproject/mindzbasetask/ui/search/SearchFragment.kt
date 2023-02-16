package com.myproject.mindzbasetask.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.myproject.mindzbasetask.R
import com.myproject.mindzbasetask.databinding.FragmentHomeBinding
import com.myproject.mindzbasetask.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {
    private var _binding: FragmentSearchBinding? = null
    lateinit var adapter:foodrvadapter
    lateinit var foodlist:ArrayList<FoodModel>
    lateinit var navController: NavController

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        val root: View = binding.root
        navController=findNavController()
        foodlist= ArrayList()
        foodlist.add(FoodModel(R.drawable.karisikrv,"Karisik","50 TL"))
        foodlist.add(FoodModel(R.drawable.mericimekrv,"Mericimekrv","50 TL"))
        foodlist.add(FoodModel(R.drawable.karamelizerv,"Karamelizerv","50 TL"))
        foodlist.add(FoodModel(R.drawable.karisikrv,"Karisik","50 TL"))
        foodlist.add(FoodModel(R.drawable.mericimekrv,"Mericimekrv","50 TL"))
        foodlist.add(FoodModel(R.drawable.karamelizerv,"Karamelizerv","50 TL"))
        adapter=foodrvadapter {
           val action=SearchFragmentDirections.actionSearchFragmentToItemsDetailsFragment(it.foodimage,it.foodname,it.foodprice
           )
            navController.navigate(action)

        }
        adapter.getfooditems(foodlist)
        binding.recyclerViewfood.layoutManager=LinearLayoutManager(requireContext())
        binding.recyclerViewfood.adapter=adapter







        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}