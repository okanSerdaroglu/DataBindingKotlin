package com.okanserdaroglu.databindingkotlin.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.okanserdaroglu.databindingkotlin.R
import com.okanserdaroglu.databindingkotlin.data.Product
import kotlinx.android.synthetic.main.row_layout.view.*

class ProductRecyclerViewAdapter(allProducts: ArrayList<Product>,context: Context) : RecyclerView.Adapter<ProductRecyclerViewAdapter.ViewHolder>() {

    private var allProducts:List<Product>
    private var context:Context

    init {
        this.context = context
        this.allProducts = allProducts
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var rootLayout = itemView as ConstraintLayout
        var productHeader = rootLayout.textViewProductHeader
        var productPrice = rootLayout.textViewProductPrice

        fun setData(product:Product, position: Int) {

             productHeader.text = product.header
             productPrice.text = (""+product.price)


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return allProducts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.setData(allProducts.get(position),position)

    }
}