package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myinstagram.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class ChooseCityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val arr = arrayOf("Oral", "Nursultan", "Almaty", "Shymkent", "Pavlodar", "Karagandy")
        val TAG = "ChooseCityActivity"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ChooseCity)

        Log.e(TAG,"")

        val adapter = ArrayAdapter(this,R.layout.abc_activity_chooser_view_list_item,arr)
        val listView: ListView = findViewById(R.id.listView_1)
        listView.setAdapter(adapter)
    }
}