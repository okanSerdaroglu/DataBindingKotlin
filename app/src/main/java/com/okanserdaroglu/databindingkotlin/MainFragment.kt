package com.okanserdaroglu.databindingkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.okanserdaroglu.databindingkotlin.adapters.ProductRecyclerViewAdapter
import com.okanserdaroglu.databindingkotlin.data.AllProducts
import com.okanserdaroglu.databindingkotlin.databinding.FragmentMainBinding

class MainFragment : Fragment(),SwipeRefreshLayout.OnRefreshListener {

    private val binding : FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        
        val allProducts = AllProducts().allProductsArray
        binding.productList = allProducts.toCollection(ArrayList())
        binding.onRefreshListener = this

        return binding.root

    }

    override fun onRefresh() {

        val newList = AllProducts().allProductsArray.toCollection(ArrayList())
        (binding.recyclerViewList.adapter as ProductRecyclerViewAdapter).refreshList(newList)
        binding.swipeRefreshLayout.isRefreshing = false

    }

}