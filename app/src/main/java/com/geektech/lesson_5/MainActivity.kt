package com.geektech.lesson_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null
    private var btn: Button? = null

    private var sum = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.text)
        btn = findViewById(R.id.btn)
        btn?.setOnClickListener {
            if (sum < 11 && btn?.text == "+1") {
                sum++
                textView?.text = sum.toString()
                if (sum == 10) {
                    btn?.text = "-1"
                }
            } else {
                sum--
                textView?.text = sum.toString()

                if (sum == 0 && btn?.text == "-1") {
                    btn?.text = "+1"
                }
            }
        }
    }
}