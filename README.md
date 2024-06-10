val EnterButton = findViewById&lt;Button&gt;(R.id.EnterButton)

val ExitButton = findViewById&lt;Button&gt;(R.id.ExitButton)

EnterButton.setOnClickListener {

val intent = Intent(this,MainScreen::class.java)

startActivity(intent)

ExitButton.setOnClickListener {

finish()

}

val Day = ArrayList&lt;String&gt;()

val Min = ArrayList&lt;Int&gt;()

val Max = ArrayList&lt;Int&gt;()

val Weather = ArrayList&lt;String&gt;()

val DateText = findViewById&lt;EditText&gt;(R.id.DateText)

val MinText = findViewById&lt;EditText&gt;(R.id.MinText)

val MaxText = findViewById&lt;EditText&gt;(R.id.MaxText)

val WeatherText = findViewById&lt;EditText&gt;(R.id.WeatherText)

val AddButton= findViewById&lt;Button&gt;(R.id.AddButton)

val ClearButton= findViewById&lt;Button&gt;(R.id.ClearButton)

val ViewButton = findViewById&lt;Button&gt;(R.id.ViewButton)

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

val DateText = intent.getStringArrayListExtra("DateText")?: arrayListOf()

val MinText = intent.getIntegerArrayListExtra("MinText")?: arrayListOf()

val MaxText = intent.getIntegerArrayListExtra("MaxText")?: arrayListOf()

val WeatherText = intent.getStringArrayListExtra("WeatherText")?: arrayListOf()

val InformationText = findViewById&lt;TextView&gt;(R.id.InformationText)

val AverageTempearture = findViewById&lt;TextView&gt;(R.id.Average)

val BackButton = findViewById&lt;Button&gt;(R.id.BackButton)

val AveargeTemperature = 0

var displayText = ""

for (i in DateText.indices){

val Temperature = MinText\[i\]+MaxText\[i\]

displayText="Day:${DateText\[i\]},Min:${MinText\[i\]}min,Max:${MaxText\[i\]}min,Weather:${WeatherText\[i\]}/n/n"

}

val AverageTemperature= if(DateText.isNotEmpty())displayText/DateText.size else 0

InformationText.text ="InformationText"

AverageTemperature.text =

BackButton.setOnClickListener {

val intent = Intent(this,MainScreen::class.java)

startActivity(intent)
