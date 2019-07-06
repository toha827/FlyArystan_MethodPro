package com.example.myapplication

import android.content.Intent
import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import com.example.myinstagram.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class CheckInActivity : BaseActivity(1) {

    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG = "CheckInActivity"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_in)
        setupBottomNavigation()
        Log.e(TAG,"")
    }
}