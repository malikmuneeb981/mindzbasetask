package com.myproject.mindzbasetask.ui.search

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.myproject.mindzbasetask.databinding.FoodrvitemBinding

class foodrvadapter(val clicklistner:(FoodModel)->Unit):RecyclerView.Adapter<foodrvadapter.foodviewholder>() {


   val foodlist=ArrayList<FoodModel>()
    lateinit var context: Context



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): foodviewholder {
        context=parent.context
        val binding=FoodrvitemBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        val foodviewholder=foodviewholder(binding)

        return foodviewholder
    }
    fun getfooditems(myfoodlist:ArrayList<FoodModel>)
    {

        foodlist.clear()
        foodlist.addAll(myfoodlist)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: foodviewholder, position: Int) {
        with(holder)
        {
            with(foodlist[position])
            {
               Glide.with(context).load(foodimage).into(binding.foodimage)
                binding.foodname.text=foodname
                binding.foodprice.text=foodprice
            }
        }
        holder.itemView.setOnClickListener {
            clicklistner.invoke(foodlist[position])
        }
    }

    override fun getItemCount(): Int {
        return foodlist.size
    }

    inner class foodviewholder(val binding:FoodrvitemBinding):RecyclerView.ViewHolder(binding.root){

    }
}