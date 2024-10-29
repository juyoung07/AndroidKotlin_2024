package com.example.gridtest

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gridtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            var id = "ID: " + binding.edtID.text.toString()
            var pw = "PW: " + binding.edtPW.text.toString()
            Toast.makeText(applicationContext, id + "\n" + pw , Toast.LENGTH_SHORT).show()
        }
        binding.btnCancel.setOnClickListener {
            binding.edtID.setText("")
            binding.edtPW.setText("")
        }
    }
}