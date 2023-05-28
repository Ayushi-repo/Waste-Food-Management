package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        mess_menu1.setOnClickListener()
        {
            val messmenu1 =Intent(this,messmenu::class.java)
            startActivity(messmenu1)
        }

        Check_amount.setOnClickListener {
            val amount = Intent(this,show_amount::class.java )
            startActivity(amount)
        }
    }
}