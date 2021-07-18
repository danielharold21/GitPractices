package com.example.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is contained in my second commit")

        println("Experimental")

        print("CHANGE 2")
        println("Hello from your friend")
        println("Hello from your friend1")
        println("Hello from your friend2")
    }


}