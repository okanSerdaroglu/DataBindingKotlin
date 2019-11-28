package com.okanserdaroglu.databindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.okanserdaroglu.databindingkotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        // activity_student  ActivityStudentBinding pascal case

        val student  = Student("okan",27)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main) // create binding and cast it ActivityMainBinding

        binding.student = student



    }
}
