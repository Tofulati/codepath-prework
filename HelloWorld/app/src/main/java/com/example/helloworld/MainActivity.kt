package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Name", "Tapped name")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Back", "Tapped back")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.white))
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("String", "Tapped string")
            val editText = findViewById<EditText>(R.id.editText)
            val text = editText.text
            findViewById<TextView>(R.id.textView).setText(text.toString())
        }
    }

}