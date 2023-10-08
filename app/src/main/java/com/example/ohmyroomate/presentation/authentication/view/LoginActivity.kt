package com.example.ohmyroomate.presentation.authentication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ohmyroomate.R
import com.example.ohmyroomate.presentation.authentication.viewmodel.LoginViewModel
import com.example.ohmyroomate.presentation.splash.viewmodel.SplashScreenViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    @Inject
    lateinit var viewmodel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}