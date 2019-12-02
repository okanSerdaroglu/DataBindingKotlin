package com.okanserdaroglu.databindingkotlin.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.okanserdaroglu.databindingkotlin.data.Product
import com.okanserdaroglu.databindingkotlin.databinding.RowLayoutBinding

class ProductRecyclerViewAdapter(
    private var allProducts: ArrayList<Product>
) : RecyclerView.Adapter<ProductRecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding: RowLayoutBinding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return allProducts.size
    }

    fun refreshList (newList : ArrayList<Product>) {
        allProducts.clear()
        allProducts.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.product = allProducts[position]
        holder.binding.executePendingBindings()

    }

    inner class ViewHolder(var binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

}