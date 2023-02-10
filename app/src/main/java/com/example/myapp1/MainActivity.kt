package com.example.myapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var userList = ArrayList<UserModel>()
    lateinit var activity: MainActivity
    lateinit var etLogin :EditText
    lateinit var etPassword :EditText
    lateinit var btnok :Button
    lateinit var tvfp : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etLogin= findViewById(R.id.etlogin)
        etPassword= findViewById(R.id.etpassword)
        tvfp=findViewById(R.id.tvfp)
        btnok= findViewById(R.id.btnok)

        btnok.setOnClickListener {



            if (etLogin.text.toString().isNullOrBlank()) {
                etLogin.error = "Enter login"
            }


           else if (etPassword.text.toString().isNullOrEmpty()) {
                etPassword.error = "Enter password"

            }
            else {
                val i = Intent(this, RegsitrationActivity2::class.java)
                startActivity(i)

            }

        }









        userList.add(UserModel("Manish",1))



    }
}