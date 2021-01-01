package com.ginkei.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ginkei.gitpractice.databinding.ActivityMainBinding

const val TAG = "experimental"

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textBase.text = getString(R.string.happy_2021)

        println("Local Change")
        Log.d(TAG, "onCreate: Experimental")
        Log.d(TAG, "onCreate: Change 2")
        Log.d(TAG, "onCreate: This line will be merged")

    }
}