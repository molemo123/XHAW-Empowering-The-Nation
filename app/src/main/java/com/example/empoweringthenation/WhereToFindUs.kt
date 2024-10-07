package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WhereToFindUs : AppCompatActivity() {

    private lateinit var btnGoBackToFeesCart: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_where_to_find_us)

        btnGoBackToFeesCart = findViewById(R.id.btnGoBackToFeesCart)


        // Set OnClickListener for Go Back button
        btnGoBackToFeesCart.setOnClickListener {
            val intent = Intent(this, FeesCalculateCart::class.java)
            startActivity(intent)
        }
    }
}
