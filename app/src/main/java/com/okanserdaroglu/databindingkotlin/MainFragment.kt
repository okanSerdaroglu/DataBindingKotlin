package com.okanserdaroglu.databindingkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.okanserdaroglu.databindingkotlin.data.AllProducts
import com.okanserdaroglu.databindingkotlin.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private val binding : FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        
        val allProducts = AllProducts().allProductsArray
        binding.productList = allProducts.toCollection(ArrayList())

        return binding.root

    }

}