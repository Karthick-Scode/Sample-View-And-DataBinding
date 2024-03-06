package com.example.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.binding.databinding.ActivityMain3Binding
import com.example.binding.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityMain4Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = DataModel(
            "The Walking Dead",
            "In the wake of a zombie apocalypse, various survivors struggle to stay alive. As they search for safety and evade the undead, they are forced to grapple with rival groups and difficult choices",
            "https://wallpapers.com/images/high/fear-the-walking-dead-a-spinoff-6fkij8jjlpgv8iqt.webp",
            9
        )

        binding.dataModel = data
    }
}