package com.example.ohmyroomate.domain.usecase

import com.example.ohmyroomate.domain.repository.IAuthRepository
import javax.inject.Inject

class RegisterUserCase @Inject constructor(
    private val authRepository: IAuthRepository
) {
}