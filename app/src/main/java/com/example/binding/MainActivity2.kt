package com.example.binding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.ViewModelProvider
import com.example.binding.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity3::class.java))
        }

        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.viewModel = myViewModel
        binding.lifecycleOwner = this


    //  Programmatically
//        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

//        myViewModel.message.observe(this, {
//            binding.textView2.text = it
//        } )

        binding.editText2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                myViewModel.setMessage(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {}

        })

    }
}