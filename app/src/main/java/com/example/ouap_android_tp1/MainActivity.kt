package com.example.ouap_android_tp1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button_main: Button = findViewById(R.id.main_Button1)
        val text_main: TextView = findViewById(R.id.main_text1)
        val list =
            listOf<String>("Frederic", "Baptiste", "Yannis", "Maxime", "Dan").sortedBy { it.length }
        //Log.d("Liste", list.toString())

        button_main.setOnClickListener {
            val randomName: String = list.random()
            text_main.text = randomName
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activite onStart", "Works")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activite onResume", "Works")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Activite onPause", "Works")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Activite onStop", "Works")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activite onDestroy", "Works")

    }
}
