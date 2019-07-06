package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.auth_activity.*

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sign_in_btn.setOnClickListener {
            val Login = email_input.text.toString()
            
        }
    }
}
