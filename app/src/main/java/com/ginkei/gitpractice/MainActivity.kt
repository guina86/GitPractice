package com.ginkei.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ginkei.gitpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textBase.text = getString(R.string.happy_2021)

        oh god what is this ?

    }
}