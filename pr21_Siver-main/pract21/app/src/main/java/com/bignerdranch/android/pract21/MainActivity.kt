package com.bignerdranch.android.pract21

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var login:EditText
    private lateinit var password:EditText
    private lateinit var button:Button
    private lateinit var prefs:SharedPreferences
    private val prefsName = "name"
    private val prefsKey = "key"
    private val keyLogin = "myKeyLogin"
    private val keyPassword = "myKeyPassword"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prefs=getSharedPreferences(prefsName, Context.MODE_PRIVATE)
        if(prefs.getBoolean(prefsKey,false)){
            startActivity(Intent(this,contacts::class.java))
            finish()
            return
        }
        initViews()
    }
    private fun initViews(){
        login=findViewById(R.id.login)
        password=findViewById(R.id.password)
        button = findViewById(R.id.button)
    }
    fun enter(view: View) {
        val log = login.text.toString().trim()
        val pas = password.text.toString().trim()
        val prefs = getSharedPreferences(prefsName, Context.MODE_PRIVATE)
        val saveLog = prefs.getString(keyLogin,null)
        val savePas = prefs.getString(keyPassword,null)
        if(saveLog == null || savePas == null){
            if(log.isEmpty() || pas.isEmpty()){
                Toast.makeText(this,"Введите логин и пароль", Toast.LENGTH_SHORT).show()
                return
            }
        }
        else{
            with(prefs.edit()){
                putBoolean(prefsKey,true)
                apply()
            }
        }
        startActivity(Intent(this,contacts::class.java))
        finish()
    }
}