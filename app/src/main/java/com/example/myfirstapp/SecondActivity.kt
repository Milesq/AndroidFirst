package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.*
import kotlinx.android.synthetic.main.activity_second.*
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)



        serviceEditEmail(email, warn_email)              //wyświetlanie i sprawdzanie poprawności email
        serviceEditPassword(password, warn_password)     //wyświetlanie i sprawdzanie poprawności password

      /*  Sex_Group.setOnCheckedChangeListener { group, checkedId ->
            run {
                val intencjaAktywująca: Intent = Intent(applicationContext,MainActivity::class.java)
                var RB: RadioButton = findViewById(checkedId)
                intencjaAktywująca.putExtra("plec", RB.text)
                startActivity(intencjaAktywująca)
            }

        }
*/
    }
    fun  submitData(view: View){

        if(!regulations_CHB.isChecked)
            Toast.makeText(applicationContext, "Proszę potwierdzić regulamin", Toast.LENGTH_SHORT)
                    .show()
        else{
            val intent = Intent(applicationContext), ProfileActivity::class.java)
        }

    }
}