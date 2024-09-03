package com.example.test02

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btn03 = findViewById<Button>(R.id.btn03)

        btn03.setOnClickListener{
            btn03.visibility = View.INVISIBLE
        }
    }
}