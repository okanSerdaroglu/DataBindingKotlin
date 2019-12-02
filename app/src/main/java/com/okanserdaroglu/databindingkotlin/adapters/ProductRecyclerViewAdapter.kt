package com.okanserdaroglu.databindingkotlin.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.okanserdaroglu.databindingkotlin.data.Product
import com.okanserdaroglu.databindingkotlin.databinding.RowLayoutBinding

class ProductRecyclerViewAdapter(allProducts: ArrayList<Product>,context: Context) : RecyclerView.Adapter<ProductRecyclerViewAdapter.ViewHolder>() {

    private var allProducts:List<Product>
    private var context:Context

    init {
        this.context = context
        this.allProducts = allProducts
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding : RowLayoutBinding = RowLayoutBinding.inflate(LayoutInflater.from(context))

        return ViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return allProducts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.product = allProducts[position]
        holder.binding.executePendingBindings()

    }

    inner class ViewHolder(var binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

}