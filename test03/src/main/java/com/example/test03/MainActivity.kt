package com.example.test03

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.test03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.linear.visibility = View.INVISIBLE
        binding.chk.setOnCheckedChangeListener { compoundButton, b ->
            val chk = false
            if (binding.chk.isChecked == true) {
                binding.linear.visibility = android.view.View.VISIBLE
            } else {
                binding.linear.visibility = android.view.View.INVISIBLE
            }
        }
        binding.calculate.setOnClickListener {
            var num1 = binding.num1.text.toString()
            var num2 = binding.num2.text.toString()
            var result:String = ""

            when(binding.rg.checkedRadioButtonId) {
                R.id.plus -> result = (Integer.parseInt(num1) + Integer.parseInt(num2)).toString()
                R.id.minus -> result = (Integer.parseInt(num1) - Integer.parseInt(num2)).toString()
                R.id.times -> result = (Integer.parseInt(num1) * Integer.parseInt(num2)).toString()
                R.id.divide -> result = (Integer.parseInt(num1) / Integer.parseInt(num2)).toString()
                else -> Toast.makeText(applicationContext, "연산자 먼저 선택하세요.", Toast.LENGTH_SHORT).show()
            }
            binding.txtResult.text = "계산결과 : " + result
        }
    }
}