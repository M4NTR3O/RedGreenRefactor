package com.bignerdranch.android.red_green_refactor

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var resultText: TextView
    private lateinit var resultText2: TextView
    private lateinit var button: Button
    private lateinit var editText: EditText
    private lateinit var resultFunction: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        resultText = findViewById(R.id.returnResult1Test)
        resultText2 = findViewById(R.id.returnResult2Test)
        button = findViewById(R.id.buttonInput)
        editText = findViewById(R.id.editTextQuery)
        resultFunction = findViewById(R.id.textViewResultFunction)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        button.setOnClickListener {
            firstTest()
            secondTest(editText.text.toString())
            resultFunction.text = getSearchUrl(editText.text.toString())
        }
    }
    fun getSearchUrl(query: String?): String?{
        if (query == null){
            return null
        }
        return "https://www.google.com/search?q=$query/"
    }
    fun firstTest(){

        if (getSearchUrl(null) == null){
            resultText.text = "Success"
        }
        else{
            resultText.text = "Not success"
        }
    }
    fun secondTest(query: String?){
        if (getSearchUrl(query) != null){
            resultText2.text = "Success"
        }
        else{
            resultText2.text = "No success"
        }
    }
}