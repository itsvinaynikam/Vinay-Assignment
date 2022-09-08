package com.example.database2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    lateinit var Emaile:EditText

     lateinit var  password:EditText

     lateinit var Fbuttonu:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Emaile=findViewById(R.id.first_password)
        password=findViewById(R.id.first_emaile)
        Fbuttonu=findViewById(R.id.first_button)

        Fbuttonu.setOnClickListener{

            var emaile=Emaile.text.toString().trim()
            var password=password.text.toString().trim()



            var intent=Intent(this,second_activity::class.java)


            intent.putExtra("Emaile",emaile)
            intent.putExtra("password",password)

            startActivity(intent)



        }




    }
}