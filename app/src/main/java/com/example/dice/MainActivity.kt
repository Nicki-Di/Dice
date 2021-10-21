package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
        rollDice()
    }

    private fun rollDice() {
        val resultTextView: TextView = findViewById(R.id.textView)
        val diceImage: ImageView = findViewById(R.id.diceImage)
        val dice = Dice(6)
        when (dice.roll()) {
            1 -> {
                resultTextView.text = "یک"
                diceImage.setImageResource(R.drawable.dice_1)
            }
            2 -> {
                resultTextView.text = "دو"
                diceImage.setImageResource(R.drawable.dice_2)
            }
            3 -> {
                resultTextView.text = "سه"
                diceImage.setImageResource(R.drawable.dice_3)
            }
            4 -> {
                resultTextView.text = "چهار"
                diceImage.setImageResource(R.drawable.dice_4)
            }
            5 -> {
                resultTextView.text = "پنج"
                diceImage.setImageResource(R.drawable.dice_5)
            }
            6 -> {
                resultTextView.text = "شش"
                diceImage.setImageResource(R.drawable.dice_6)
            }
        }
    }
}

class Dice(private val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}