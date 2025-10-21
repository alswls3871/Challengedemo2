package com.example.challengedemo

import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CalendarActivity : AppCompatActivity() {

    private lateinit var calendarView: CalendarView
    private lateinit var tvSelectedDate: TextView
    private lateinit var btnGood: Button
    private lateinit var btnSoSo: Button
    private lateinit var btnBad: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        calendarView = findViewById(R.id.calendarView)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)
        btnGood = findViewById(R.id.btnGood)
        btnSoSo = findViewById(R.id.btnSoSo)
        btnBad = findViewById(R.id.btnBad)

        calendarView.setOnDateChangeListener { _, year, month, day ->
            tvSelectedDate.text = "선택한 날짜: ${year}년 ${month + 1}월 ${day}일"
        }

        btnGood.setOnClickListener {
            Toast.makeText(this, "뿌듯해요", Toast.LENGTH_SHORT).show()
        }
        btnSoSo.setOnClickListener {
            Toast.makeText(this, "아쉬워요", Toast.LENGTH_SHORT).show()
        }
        btnBad.setOnClickListener {
            Toast.makeText(this, "반성해요", Toast.LENGTH_SHORT).show()
        }
    }
}

