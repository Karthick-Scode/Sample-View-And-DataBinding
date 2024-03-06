package com.example.binding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myUser = User("Thomas", "Shelby", 25, true)

        binding.user = myUser

        binding.button.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity2::class.java))
        }
    }
}
