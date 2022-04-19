package com.example.amit

import android.content.Intent
import android.location.Address
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnsave.setOnClickListener {

            var Name=edtName.text.toString()
            var Gender=edtGender.text.toString()
            var Age=edtAge.text.toString().toInt()
            var Address=edtAddress.text.toString()
            var fruit=Emp(Name,Gender,Age,Address)
            var db= DBHelper(this)
            var falg=db.insert(fruit)
            if(falg)
            {
                Toast.makeText(this,"record inerted", Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"record not inserted", Toast.LENGTH_LONG).show()
            }
        }
        btnview.setOnClickListener {
            var intent= Intent(this,ViewAllActivity::class.java)
            startActivity(intent)
        }
    }
}