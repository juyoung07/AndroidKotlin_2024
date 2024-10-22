package com.example.tabletest01

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tabletest01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            var str = "이름: " + binding.edtName.text.toString() + "\n전화번호: " + binding.edtTel.text.toString()
            Toast.makeText(applicationContext, str, Toast.LENGTH_SHORT).show()
        }
    }
}