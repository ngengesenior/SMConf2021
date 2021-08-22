package com.ngengeapps.smconf2021.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ngengeapps.smconf2021.Greeting
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import com.ngengeapps.smconf2021.android.ui.SMConfTheme

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SMConfTheme() {
                Surface(color = MaterialTheme.colors.surface) {
                    Text(text = "Hello SMConf 2021")
                }

            }

        }
    }
}
