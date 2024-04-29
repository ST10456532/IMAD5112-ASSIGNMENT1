package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("UNREACHABLE_CODE", "UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 20..25 -> "The Notorious BIG"
                    in 30..39 -> "two"
                    in 40..45 -> "three"
                    in 45..47 -> "four"
                    in 47..49 -> "five"
                    in 55..59 -> "six"
                    in 60..65 -> "seven"
                    in 70..80 -> "eight"
                    in 80..85 -> "nine"
                    in 86..90 -> "ten"
                    else -> ""
                               
                            }
                            val also = buildString {
                                append("Age: ")
                                append(age)
                                append("\n")
                                val append: StringBuilder = append(
                                    when (result) {
                                        "The Notorious BIG" -> "The Notorious BIG died between the ages of 20 and 25"
                                        "two" -> "Princess Diana died between the ages of 30 and 39"
                                        "three" -> "Paul Walker died between the ages of 40 and 47"
                                        "four" -> "Whitney Houston died between the ages of 47 and 49"
                                        "five" -> "Michael Jackson died between the ages of 49 and 55"
                                        "six" -> "Prince died between the ages of 55 and 58"
                                        "seven" -> "Diego Maradona died between the ages of 60 and 65 "
                                        "eight" -> "James Brown died between the ages 70 and 80"
                                        "nine" -> "Neil Armstrong died between the ages of 80 and 85"
                                        "ten" -> "Maya Angelou died between the ages of 86 and 90"


                                        else -> "Please re-enter a valid Number within the range 20-100"
                                    }
                                )
                                append("    ")
                            }.also { txtResult.text = it }
                            btnClear.setOnClickListener() {
                                ageNumber.text.clear()
                                txtResult.text = ""
                            }
                        }
                    }
                }
            }






