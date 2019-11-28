package com.okanserdaroglu.databindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import com.okanserdaroglu.databindingkotlin.data.Student
import com.okanserdaroglu.databindingkotlin.databinding.ActivityMainBinding
import com.okanserdaroglu.databindingkotlin.fragments.ProductDetailFragment

class MainActivity : AppCompatActivity() {

    //private lateinit var binding : ActivityMainBinding
    //lateInit means there is not an initial value here but i am going to give it. Don't worry =)
    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
    //lazy means dont give an initial value for binding whenever we need it


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        // activity_student  ActivityStudentBinding pascal case
        /*val student  =
            Student("okan", 27)
        binding.student = student*/

        callFragment()


    }

    private fun callFragment() {

        val productDetailFragment = ProductDetailFragment() // fragment
        val transaction: FragmentTransaction =
            supportFragmentManager.beginTransaction() // transaction
        transaction.replace(
            binding.frameLayoutContainer.id,
            productDetailFragment,
            "productDetailFragment"
        )
        transaction.commit()

    }


}
