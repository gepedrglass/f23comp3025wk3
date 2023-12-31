package com.example.f23comp3025wk3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.f23comp3025wk3.databinding.ActivityMainBinding


//written in java: public class MainActibity extends AppCompatActivity
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("lifecycle", "MainActivity.onCreate() called" )
    }

    
}