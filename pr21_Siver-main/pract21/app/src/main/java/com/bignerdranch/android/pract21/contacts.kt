package com.bignerdranch.android.pract21

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

private lateinit var list:ListView
private lateinit var button2: Button
private lateinit var button3: Button
private lateinit var prefs: SharedPreferences

class contacts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
    }

    fun back(view: View) {
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }

    fun enter(view: View) {
        startActivity(Intent(this,new_contact::class.java))
        finish()
    }
}