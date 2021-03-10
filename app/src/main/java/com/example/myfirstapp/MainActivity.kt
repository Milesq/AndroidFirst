package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Bt1 = findViewById<Button>(R.id.Button_1)
        val Bt2 = findViewById<Button>(R.id.Button_2)

        Bt1.setOnClickListener{
            var message = Toast.makeText(applicationContext, "Thank You", Toast.LENGTH_LONG)
            message.show()
        }

        Bt2.setOnClickListener{
            val message = Toast.makeText(applicationContext, "Congratulations", Toast.LENGTH_SHORT)
            message.show()

            val adress = "https://play.google.com/store/apps/details?id=com.FilipCzerwinski.Jushroom"
            val myapp = Intent(Intent.ACTION_VIEW, Uri.parse(adress))
            startActivity(myapp)
        }
    }
}
