package com.okanserdaroglu.databindingkotlin.dataBindings

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.okanserdaroglu.databindingkotlin.R

object GlideBindingAdapters {

    @JvmStatic
    @BindingAdapter("showImagesWithGlide")
    fun showImagesWithGlide(imageView: ImageView, drawable: Int) {

        //imageView.setImageResource(drawable)
        val options = RequestOptions.placeholderOf(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
        Glide.with(imageView.context).setDefaultRequestOptions(options).load(drawable).into(imageView)

    }

}