package com.example.myapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class RegsitrationActivity2 : AppCompatActivity() {
    lateinit var activity2: RegsitrationActivity2
    lateinit var etName: EditText
    lateinit var etAddress: EditText
    lateinit var etEmail: EditText
    lateinit var etPhone: EditText
    lateinit var btnregister: Button
    lateinit var tvg: TextView
    lateinit var etconfpass: EditText
    lateinit var etpass1: EditText
    lateinit var rdg: RadioGroup
    lateinit var rdmale: RadioButton
    lateinit var rdfemale: RadioButton
    lateinit var rdbother: RadioButton
    lateinit var edtenteryourg: EditText



    var a = arrayOf(1, 2, 3, 4)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regsitration2)

        for (i in 2..(a.size - 1)) {
            a[i] = a[i] * a[i - 1]
        }

        for (i in 0..(a.size - 1)) {
            print("a[i] ${a[i]}")
        }


        etName = findViewById(R.id.etname)
        etAddress = findViewById(R.id.etaddress)
        etEmail = findViewById(R.id.etemail)
        etPhone = findViewById(R.id.etphoneno)
        tvg=findViewById(R.id.tvg)
        etconfpass=findViewById(R.id.etconfpass)
        etpass1=findViewById(R.id.etpassw1)
        rdmale=findViewById(R.id.rdbmale)
        rdfemale=findViewById(R.id.rdbfemale)
        rdbother=findViewById(R.id.rdbother)
        edtenteryourg=findViewById(R.id.edtenteryourg)
        btnregister = findViewById(R.id.btnregi)
        btnregister.setOnClickListener {
            if (etName.text.toString().isNullOrEmpty()) {
                etName.error = "Enter Name"
                return@setOnClickListener
            }
            if (etAddress.text.toString().isNullOrEmpty()) {
                etAddress.error = "Enter Address"
                return@setOnClickListener
            }
            if (etEmail.text.toString().isNullOrEmpty()) {
                etEmail.error = "Enter Email"
                return@setOnClickListener
            }
            if (etPhone.text.toString().isNullOrEmpty()) {
                etPhone.error = "Enter Phone"
                return@setOnClickListener
            }
            if(etpass1.text.toString().isNullOrEmpty()){
                etpass1.error="Enter password"
                return@setOnClickListener
            }
            if (etconfpass.text.toString().isNullOrEmpty()) {
                etconfpass.error="confirm password"
                return@setOnClickListener
            }
            if (etconfpass.text.toString().equals(etpass1.text.toString()) == false){
                etconfpass.error="password not matched"
                return@setOnClickListener
            }

                intent = Intent(this, HomeActivity2::class.java)
                startActivity(intent)


        }

      rdbother.setOnCheckedChangeListener { buttonView, isChecked ->
          if(isChecked){
              edtenteryourg.visibility = View.VISIBLE
          }else{
              edtenteryourg.visibility = View.GONE
          }

      }















    }
}






