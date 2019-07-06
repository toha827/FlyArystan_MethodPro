package com.example.myinstagram

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.myapplication.*
import kotlinx.android.synthetic.main.bottomnavigationview.*

abstract class BaseActivity(val navNumber : Int) : AppCompatActivity() {
    fun setupBottomNavigation(){
        bottom_navigation_view.setTextVisibility(false)
        bottom_navigation_view.setLabelVisibilityMode(1)
        bottom_navigation_view.setItemHorizontalTranslationEnabled(false)
        bottom_navigation_view.enableAnimation(false)
        for(i in 0 until bottom_navigation_view.menu.size()){
            bottom_navigation_view.setIconTintList(i,null)
        }

        bottom_navigation_view.setOnNavigationItemSelectedListener {

            val nextActivity =
                when(it.itemId){
                    R.id.nav_item_home -> HomeActivity::class.java
                    R.id.nav_item_checkIn -> CheckInActivity::class.java
                    R.id.nav_services -> ServicesActivity::class.java
                    R.id.nav_flight -> FlightStatusActivity::class.java
                    R.id.nav_profile -> ProfileActivity::class.java
                    else -> {
                        Log.e("ssss","unknown")
                        null
                    }
                }
            if (nextActivity != null){
                val intent = Intent(this,nextActivity)
                intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
                startActivity(intent)
                overridePendingTransition(0,0)
            }
            false
        }
        bottom_navigation_view.menu.getItem(navNumber).isChecked = true
    }
}