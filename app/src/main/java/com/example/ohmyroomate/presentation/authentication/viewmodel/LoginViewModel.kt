package com.example.ohmyroomate.presentation.authentication.viewmodel

import androidx.lifecycle.ViewModel
import com.example.ohmyroomate.domain.usecase.LoginUseCase
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    val loginUseCase: LoginUseCase
) : ViewModel() {
}