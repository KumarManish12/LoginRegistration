package com.example.myapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity2 : AppCompatActivity() {
    lateinit var activity2: HomeActivity2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
    }
}