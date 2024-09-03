package com.example.firsttest01

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var txtName = findViewById<TextView>(R.id.txtName)  // id로 만든 것 중에 이름이 txtName인 것을 가져옴
        var btnName = findViewById<Button>(R.id.btnName)

        btnName.setOnClickListener(View.OnClickListener {
            txtName.text="mirim"
        })
    }
}