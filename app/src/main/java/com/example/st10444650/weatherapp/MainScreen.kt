package com.example.st10444650.weatherapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Day = ArrayList<String>()
        val Min = ArrayList<Int>()
        val Max = ArrayList<Int>()
        val Weather = ArrayList<String>()

        val DateText = findViewById<EditText>(R.id.DateText)
        val MinText = findViewById<EditText>(R.id.MinText)
        val MaxText = findViewById<EditText>(R.id.MaxText)
        val WeatherText = findViewById<EditText>(R.id.WeatherText)

        val AddButton= findViewById<Button>(R.id.AddButton)
        val ClearButton= findViewById<Button>(R.id.ClearButton)
        val ViewButton = findViewById<Button>(R.id.ViewButton)

        AddButton.setOnClickListener {
            val DateText = DateText.text.toString()
            val MinText = MinText.text.toString().toIntOrNull()
            val MaxText = MaxText.text.toString().toIntOrNull()
            val WeatherText = WeatherText.text.toString()

            if (DateText.isNotEmpty() && MinText = null == true && MaxText =
                    null && WeatherText.isNotEmpty()



                DateText.AddButton(DateText)
                MinText.Add(MinText)
                MaxText.Add(MaxText)
                WeatherText.Add(WeatherText)

                Toast.makeText(this,"DataAdded", Toast.LENGTH_SHORT).show()
                clearFields(DateText, MinText, MaxText, WeatherText)

            } else {

                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()

            }
        }
    // The code that is commented out below will clear all data saved in arraylists

        ClearButton.setOnClickListener

            //Day.clear()
            //Min.clear()
            //Max.clear()
            //Weather.clear()
            // Toast.make(this,"Data Cleared",Toast.LENGTH_SHORT).show()
            ClearButton(DateText,MaxText,MinText,WeatherText)


    }
            intent.putStringArrayListExtra("dates",DateText)
            intent.putStringArrayListExtra("Min",MinText)
            intent.putStringArrayListExtra("Max",MaxText)
            intent.putStringArrayListExtra("Weather",WeatherText)
            startActiv
        private fun ClearButton(vararg fields:EditText){
            for (field in field){
                field.text.Clear
            }
        }
}