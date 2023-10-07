package com.example.ohmyroomate.presentation.splash.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.ohmyroomate.R
import com.example.ohmyroomate.databinding.ActivitySplashScreenBinding
import com.example.ohmyroomate.presentation.authentication.view.LoginActivity
import com.example.ohmyroomate.presentation.splash.viewmodel.SplashScreenViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@AndroidEntryPoint
class ScreenSplash : AppCompatActivity() {
    private val binding: ActivitySplashScreenBinding by lazy {
        DataBindingUtil.setContentView(
            this,
            R.layout.activity_splash_screen
        )
    }

    @Inject
    lateinit var viewmodel: SplashScreenViewModel
    private lateinit var job: Job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewmodel = viewmodel

        job = viewmodel.uiState.filter { it }
            .onEach {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
            .launchIn(lifecycleScope)
    }

    override fun onPause() {
        super.onPause()
        Log.e("huy.hoang1", "onPause: ${job.isCancelled}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("huy.hoang1", "onDestroy: ${job.isCancelled}")
    }
}