package com.marinamari.warioone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.marinamari.warioone.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // 3 Seconds

    private lateinit var binding: ActivityMainBinding
    private lateinit var colorCommand: TextView
    private lateinit var resetBtn: Button
    private lateinit var yellowButton: Button
    private lateinit var blueButton: Button
    private lateinit var redButton: Button
    private lateinit var orangeButton: Button
    private lateinit var buttonNumDebug: TextView
    private lateinit var randomNumDebug: TextView
    private var color: String = ""
    private lateinit var secretDebugButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val blueButton = findViewById<Button>(R.id.blueButton)
        val orangeButton = findViewById<Button>(R.id.orangeButton)
        val redButton = findViewById<Button>(R.id.redButton)
        val yellowButton = findViewById<Button>(R.id.yellowButton)

        val colorCommand = findViewById<TextView>(R.id.colorCommand)

        var randomNum = Random.nextInt(1, 4)
        var buttonNum = 0

        var gameRunning = true

        fun checker() {
            if (buttonNum == randomNum) {
                color = "Correct!"
            } else {
                color = "WRONG"
            }
            gameRunning = false
            colorCommand.text = color
        }

        redButton.setOnClickListener {
            if (gameRunning) {
                buttonNum = 1
                checker()
                print(buttonNum)
            }
        }

        blueButton.setOnClickListener {
            if (gameRunning) {
                buttonNum = 2
                checker()
                print(buttonNum)
            }
        }

        orangeButton.setOnClickListener {
            if (gameRunning) {
                buttonNum = 3
                checker()
                print(buttonNum)
            }
        }

        yellowButton.setOnClickListener {
            if (gameRunning) {
                buttonNum = 4
                checker()
                print(buttonNum)
            }
        }

        if (randomNum == 1) {
            color = "Red!"
        } else if (randomNum == 2) {
            color = "Blue!"
        } else if (randomNum == 3) {
            color = "Orange!"
        } else if (randomNum == 4) {
            color = "Yellow!"
        } else {
            color = "uh...wat"
        }

        colorCommand.text = color

    }
}