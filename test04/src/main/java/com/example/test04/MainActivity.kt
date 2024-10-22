package com.example.test04

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.test04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            Toast.makeText(applicationContext, "이름: " + binding.edtName.toString(),  Toast.LENGTH_SHORT).show()
            Toast.makeText(applicationContext, "전화번호: " + binding.edtTel.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}