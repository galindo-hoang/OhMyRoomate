package com.example.ohmyroomate.domain.usecase

import com.example.ohmyroomate.domain.repository.IAuthRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    val authRepository: IAuthRepository
) {
    fun invoke(email :String, pass: String) {
        authRepository.login(email, pass)
    }
}