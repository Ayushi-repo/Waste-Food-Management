package com.example.practice

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    var input: String? = " ";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button4.setOnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            if(editText_username.getText().toString().equals("admin") && editText_password.getText().toString().equals("21112"))
                {
                startActivity(i)
                    finish()
                }
            else
            {
                if(editText_username.getText().toString().isEmpty()){
                    editText_username.error="Please enter correct username"
                }
                if(editText_password.getText().toString().isEmpty()){
                    editText_password.error="Please enter correct password"
                }
                Toast.makeText(this, "wrong credenitals", Toast.LENGTH_SHORT).show()
            }
        }
    }
}