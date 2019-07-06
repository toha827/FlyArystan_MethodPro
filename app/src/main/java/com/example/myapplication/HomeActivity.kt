package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import com.example.myinstagram.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : BaseActivity(0) {

    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG = "HomeActivity"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupBottomNavigation()
        Log.e(TAG,"")
    }
}