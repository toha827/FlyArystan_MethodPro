package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.registration_activity.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sign_up_btn.setOnClickListener {
            performRegister()
        }
    }
    private fun performRegister(){
        val Login = email_input.text.toString()
        val passwd = passwd_input.text.toString()
        val re_passwd = re_passwd_input.text.toString()

        if (Login.isEmpty() || passwd.isEmpty()) {
            Toast.makeText(this,"Please enter Email/Password", Toast.LENGTH_SHORT).show()
            return
        }

        if(passwd == re_passwd){
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(Login,passwd).addOnCompleteListener {
                if(!it.isSuccessful) return@addOnCompleteListener

                //else if Successfull
                Log.d("Registration","Successfully created user with id ${it.result!!.user.uid}")
            }.addOnFailureListener {
                Log.d("Registration", "Failed registration ${it.message}")
            }
        }
    }
}
