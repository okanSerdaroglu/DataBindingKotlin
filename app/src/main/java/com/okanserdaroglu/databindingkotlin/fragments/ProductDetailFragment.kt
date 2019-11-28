package com.okanserdaroglu.databindingkotlin.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.okanserdaroglu.databindingkotlin.data.AllProducts

import com.okanserdaroglu.databindingkotlin.databinding.FragmentProductDetailBinding


class ProductDetailFragment : Fragment() {

    private val binding : FragmentProductDetailBinding by lazy {
        FragmentProductDetailBinding.inflate(layoutInflater)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        val product = AllProducts()

        binding.product = product.allProductsArray[0]

        return binding.root
    }


}
