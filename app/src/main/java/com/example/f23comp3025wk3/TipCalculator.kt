package com.example.f23comp3025wk3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.f23comp3025wk3.databinding.ActivityMain2Binding

class TipCalculator : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)


        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}