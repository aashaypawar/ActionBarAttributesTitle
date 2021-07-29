package com.aashay.actionbarheight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and initializing EditText and Button from the layout file
        val mEditText = findViewById<EditText>(R.id.editText)
        val mButtonText = findViewById<Button>(R.id.button1)


        // When the button is clicked
        mButtonText.setOnClickListener {

            // If the EditText field is not empty, the ActionBar title will change
            // Else, the application will display a Toast message
            if(mEditText.text.isNotEmpty()){
                title = mEditText.text.toString()
            } else {
                Toast.makeText(applicationContext, "No input", Toast.LENGTH_SHORT).show()
            }
        }
    }
}