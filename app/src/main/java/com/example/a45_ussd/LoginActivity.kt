package com.example.a45_ussd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.nav_host_login).navigateUp()
    }
}