package com.example.st10444650.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedView : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
         val DateText = intent.getStringArrayListExtra("DateText")?: arrayListOf()
        val MinText = intent.getIntegerArrayListExtra("MinText")?: arrayListOf()
        val MaxText = intent.getIntegerArrayListExtra("MaxText")?: arrayListOf()
        val WeatherText = intent.getStringArrayListExtra("WeatherText")?: arrayListOf()

        val InformationText = findViewById<TextView>(R.id.InformationText)
        val AverageTempearture = findViewById<TextView>(R.id.Average)
        val BackButton = findViewById<Button>(R.id.BackButton)

        val AveargeTemperature = 0
        var displayText = ""
        for (i in DateText.indices){
            val Temperature = MinText[i]+MaxText[i]
            displayText="Day:${DateText[i]},Min:${MinText[i]}min,Max:${MaxText[i]}min,Weather:${WeatherText[i]}/n/n"
        }
        val AverageTemperature= if(DateText.isNotEmpty())displayText/DateText.size else 0

        InformationText.text ="InformationText"
        AverageTemperature.text =

        BackButton.setOnClickListener {
            val intent = Intent(this,MainScreen::class.java)
            startActivity(intent)


}}}
