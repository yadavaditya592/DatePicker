package com.example.date

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import java.util.Calendar
import java.util.Date

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val selectedDateTextView=findViewById<TextView>(R.id.text)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
//            showDatePicker()
//
//
//
//    fun showDatePicker(){
        val calendar=Calendar.getInstance()
        val year=calendar.get(Calendar.YEAR)
        val month=calendar.get(Calendar.MONTH)
        val day=calendar.get(Calendar.DATE)
        selectedDateTextView.text="$day / ${month+1}/$year"

        val datePickerDialog=DatePickerDialog(this,DatePickerDialog.OnDateSetListener { datePicker, year, monthofyear, dayOfMonth ->
            val month1=monthofyear +1
            selectedDateTextView.text="$dayOfMonth/0$month1/$year"
        } ,year,month,day)

        datePickerDialog.show()

    }

}








    }


