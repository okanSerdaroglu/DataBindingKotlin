package com.okanserdaroglu.databindingkotlin.dataBindings

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.okanserdaroglu.databindingkotlin.adapters.ProductRecyclerViewAdapter
import com.okanserdaroglu.databindingkotlin.data.Product

object MainFragmentBindingAdapters {

    @JvmStatic
    @BindingAdapter("showProductList")
    fun showProductList(recyclerView: RecyclerView, productList: ArrayList<Product>) {

        if (productList.isEmpty()) {
            return
        }
        val layoutManager = GridLayoutManager(recyclerView.context, 2)
        if (recyclerView.layoutManager == null) {
            recyclerView.layoutManager = layoutManager
        }

        val adapter = ProductRecyclerViewAdapter(productList, recyclerView.context)
        recyclerView.adapter = adapter

    }

}