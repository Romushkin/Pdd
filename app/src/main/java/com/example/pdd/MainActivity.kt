package com.example.pdd

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var infoTV: TextView
    private lateinit var infoCheckCB: CheckBox
    private lateinit var firstRuleTV: TextView
    private lateinit var secondRuleTV: TextView

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        infoTV = findViewById(R.id.infoTV)
        infoCheckCB = findViewById(R.id.infoCheckCB)
        firstRuleTV = findViewById(R.id.firstRuleTV)
        secondRuleTV = findViewById(R.id.secondRuleTV)
        val txt = infoTV.text

        infoCheckCB.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                infoTV.text = "Правила дорожного движения"
                firstRuleTV.text = "1. Дабуди"
                secondRuleTV.text = "2. Дабудай"
            } else {
                infoTV.text = txt
                firstRuleTV.text =""
                secondRuleTV.text=""
            }
        }
    }

}