package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText

class Main2Activity() : AppCompatActivity(){

    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var btnLogin: Button

    val validusername="7719662633"
    val validpassword="manisha"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        title = "environment"
        username = findViewById(R.id.etsubheader)
        password = findViewById(R.id.etsubheader1)
        btnLogin = findViewById(R.id.btnlogin)



        btnLogin.setOnClickListener {
            val mobile=username.text.toString()
            val spassword=password.text.toString()

            if((mobile == validusername) && (spassword == validpassword))
            { val intent = Intent(this@Main2Activity, MainActivity::class.java)
            startActivity(intent)}
            else
            {
                Toast.makeText(
                    this@Main2Activity, "incorrect credentials",
                    Toast.LENGTH_LONG
                ).show()
            }
        }


    }
}



