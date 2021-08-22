package com.ngengeapps.smconf2021.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ngengeapps.smconf2021.Greeting
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.compose.material.Text

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            Text(text = "Hello SMConf 2021")
        }
    }
}
