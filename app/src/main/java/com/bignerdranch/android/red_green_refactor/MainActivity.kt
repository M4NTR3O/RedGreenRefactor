package com.bignerdranch.android.red_green_refactor

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var resultText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        resultText = findViewById(R.id.returnResult1Test)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        firstTest()
    }
    fun getSearchUrl(query: String?): String?{
        if (query == null){
            return null
        }
        return ""
    }
    fun firstTest(){

        if (getSearchUrl(null) == null){
            resultText.text = "Success"
        }
        else{
            resultText.text = "Not success"
        }
    }
}