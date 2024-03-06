package com.example.binding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.binding.databinding.ActivityMain2Binding
import com.example.binding.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = User("John", "Shelby",24, true)

        binding.user = user

        binding.button3.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity4::class.java))
        }
    }
}