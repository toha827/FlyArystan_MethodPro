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
import kotlinx.android.synthetic.main.activity_main.*
import com.example.myapplication.CheckInActivity.*

class ChooseCityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val arr = arrayOf("Oral", "Nursultan", "Almaty", "Shymkent", "Pavlodar", "Karagandy")
        val TAG = "ChooseCityActivity"
        val btn = intent.getStringExtra("Btn")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_city)

        Log.e(TAG,"")

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
        val listView: ListView = this.findViewById(R.id.listView_1)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            print(selectedItem)
            intent = Intent(this,CheckInActivity::class.java)
            intent.putExtra("City",selectedItem)
            intent.putExtra("Btn",btn)
            startActivity(intent)

        }
    }
}