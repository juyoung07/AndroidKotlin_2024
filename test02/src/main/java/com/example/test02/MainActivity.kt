package com.example.test02

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_test03)

        var edName = findViewById<EditText>(R.id.etName)
        var edAge = findViewById<EditText>(R.id.etAge)

        var btnOK = findViewById<Button>(R.id.btnOK)

        btnOK.setOnClickListener {
            var name = edName.text
            Toast.makeText(applicationContext, "입력한 이름 : " + name, Toast.LENGTH_SHORT).show()
        }
    }
}