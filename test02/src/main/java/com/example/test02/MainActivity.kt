package com.example.test02

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_test04)

        var chk = findViewById<CheckBox>(R.id.chk)
        var linear = findViewById<LinearLayout>(R.id.linear)
        var rg = findViewById<RadioGroup>(R.id.rg)
        var btn = findViewById<Button>(R.id.btn)
        var imgPet = findViewById<ImageView>(R.id.imgPet)

        chk.setOnCheckedChangeListener { compoundButton, b ->
            if (chk.isChecked == true) {
                linear.visibility = android.view.View.VISIBLE
            } else {
                linear.visibility = android.view.View.INVISIBLE
                rg.clearCheck()     // 라디오 그룹에 선택된걸 다 비선택으로..
                chk.isChecked = false
                imgPet.setImageDrawable(null)
            }
        }
        btn.setOnClickListener {
            when(rg.checkedRadioButtonId) {
                R.id.rdoCat -> imgPet.setImageResource(R.drawable.mycat3)
                R.id.rdoDog -> imgPet.setImageResource(R.drawable.mycat)
                R.id.rdoRabbit -> imgPet.setImageResource(R.drawable.mycat2)
                else -> Toast.makeText(applicationContext, "동물먼저 선택하세요", Toast.LENGTH_SHORT).show()
            }
        }


//        var edName = findViewById<EditText>(R.id.etName)
//        var edAge = findViewById<EditText>(R.id.etAge)
//
//        var btnOK = findViewById<Button>(R.id.btnOK)
//
//        btnOK.setOnClickListener {
//            var name = edName.text
//            Toast.makeText(applicationContext, "입력한 이름 : " + name, Toast.LENGTH_SHORT).show()
//        }
    }
}