package com.example.ohmyroomate.presentation.splash.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.ohmyroomate.presentation.splash.model.SplashModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class SplashScreenViewModel @Inject constructor() : ViewModel() {
    private val _dataState = SplashModel("Let's Go")
    val dataState = _dataState
    private val _uiState = MutableStateFlow(false)
    val uiState = _uiState.asStateFlow()

    fun handleClick() {
        _uiState.value = true
    }
}