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
import kotlinx.android.synthetic.main.activity_check_in.*
import kotlinx.android.synthetic.main.activity_main.*

public class CheckInActivity : BaseActivity(0) {

    override fun onCreate(savedInstanceState: Bundle?) {

        val TAG = "CheckInActivity"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_in)
        setupBottomNavigation()
        Log.e(TAG,"")
        txt_from.setOnClickListener {
            val intent = Intent(this,ChooseCityActivity::class.java)
            intent.putExtra("Btn","From")
            startActivity(intent)
        }
        txt_to.setOnClickListener {
            val intent = Intent(this,ChooseCityActivity::class.java)
            intent.putExtra("Btn","To")
            startActivity(intent)
        }
        val city=intent.getStringExtra("City")
        val btn = intent.getStringExtra("Btn")
        try {
            if (btn.toString() == "From") {
                txt_from.setText(city)
            }
            else{
                txt_to.setText(city)
            }
        }catch (e:Exception){

        }
    }
}