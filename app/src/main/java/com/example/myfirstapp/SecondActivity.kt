package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onUserInteraction() {
        super.onUserInteraction()

        var password = findViewById(R.id.password) as EditText
        var email = findViewById(R.id.email) as EditText
        var warn_password = findViewById(R.id.warn_password) as TextView
        var warn_email = findViewById(R.id.warn_email) as TextView


        if (password.isFocused) {
            if (password.length() < 6) {
                warn_password.setText("password is too short")
                warn_password.visibility = TextView.VISIBLE
            } else {
                warn_password.setText("Almost ready")
                warn_password.visibility = TextView.VISIBLE
            }
        }
         else{
                warn_password.visibility = TextView.INVISIBLE
            }

        if (email.isFocused) {
                warn_email.setText("Wrong e-mail")
            for (i in email.text) {
                if (i == '@') {
                        warn_email.setText("Correct e-mail")
                        warn_email.visibility = TextView.VISIBLE
                    }
                else {
                        warn_email.visibility = TextView.VISIBLE
                    }
                }
            } 
        else {
                warn_email.visibility = TextView.INVISIBLE
            }

        }

    }
