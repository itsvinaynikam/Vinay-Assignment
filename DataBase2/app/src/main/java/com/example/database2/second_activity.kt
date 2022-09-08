package com.example.database2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class second_activity : AppCompatActivity() {

    lateinit var etEmaile: TextView


    lateinit var  etpassword :TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        etEmaile=findViewById(R.id.second_password)
        etpassword=findViewById(R.id.second_emaile)

        var semaile=intent.getStringExtra("Emaile")
        var password=intent.getStringExtra("password")


        etEmaile.text="$semaile"
        etpassword.text="$password"



    }
}