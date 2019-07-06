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

public class CheckInActivity : BaseActivity(1) {

    override fun onCreate(savedInstanceState: Bundle?) {
        var FirstChoosed = false
        var SecondChoosed = false

        val TAG = "CheckInActivity"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_in)
        setupBottomNavigation()
        Log.e(TAG,"")
        txt_from.setOnClickListener {
            val intent = Intent(this,ChooseCityActivity::class.java)
            intent.putExtra("Btn","From")
            if(FirstChoosed){
                intent.putExtra("FirstChooise", txt_from.text)
            }
            if (SecondChoosed){
                intent.putExtra("SecondChooise", txt_to.text)
            }
            startActivity(intent)
        }
        txt_to.setOnClickListener {
            val intent = Intent(this,ChooseCityActivity::class.java)
            intent.putExtra("Btn","To")
            startActivity(intent)
        }
        val Chooise1 = intent.getStringExtra("FirstChooise")
        val Chooise2 = intent.getStringExtra("SecondChooise")

        try{
            if (Chooise1 != null){
                FirstChoosed = true
                val city= intent.getStringExtra("City")
                val btn = intent.getStringExtra("Btn")
                if (btn.toString() == "From") {
                    txt_from.setText(city)
                }
                else{
                    txt_from.setText(Chooise1)
                    txt_to.setText(city)
                }
            }
            if (Chooise2 != null){
                SecondChoosed = true
                val city= intent.getStringExtra("City")
                val btn = intent.getStringExtra("Btn")
                if (btn.toString() == "To") {
                    txt_to.setText(city)
                }
                else{
                    txt_to.setText(Chooise2)
                    txt_from.setText(city)
                }
            }
        }catch (e: Exception){

        }
    }
}