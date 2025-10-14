package com.bignerdranch.android.pract21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class new_contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_contact)
    }

    fun back(view: View) {
        startActivity(Intent(this,contacts::class.java))
        finish()
    }

    fun enter(view: View) {

        startActivity(Intent(this,contacts::class.java))
        finish()
    }
}