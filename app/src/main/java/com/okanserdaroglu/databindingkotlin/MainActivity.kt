package com.okanserdaroglu.databindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.okanserdaroglu.databindingkotlin.data.Student
import com.okanserdaroglu.databindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var binding : ActivityMainBinding
    // lateInit means there is not an initial value here but i am going to give it. Don't worry =)

    private val binding : ActivityMainBinding by lazy {  // lazy means dont give an initial value for binding whenever we need it
        DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        // activity_student  ActivityStudentBinding pascal case

        val student  =
            Student("okan", 27)

        binding.student = student



    }
}
