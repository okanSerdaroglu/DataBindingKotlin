package com.okanserdaroglu.databindingkotlin.dataBindings

import android.app.Activity
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
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

        val adapter = ProductRecyclerViewAdapter(productList)
        recyclerView.adapter = adapter

    }

    @JvmStatic
    @BindingAdapter("setRefreshListener")
    fun setRefreshListener (swipeRefreshLayout: SwipeRefreshLayout, swipeRefreshListener: SwipeRefreshLayout.OnRefreshListener) {
        swipeRefreshLayout.setOnRefreshListener (swipeRefreshListener)
    }



}