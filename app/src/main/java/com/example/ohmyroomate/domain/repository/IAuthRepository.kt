package com.example.ohmyroomate.domain.repository

import com.example.ohmyroomate.data.model.AuthResponseBody
import kotlinx.coroutines.flow.Flow

interface IAuthRepository {
    // id request temp create
    fun register(gmail: String, password: String, name: String): Flow<AuthResponseBody>

    // id profile
    fun login(gmail: String, password: String): Flow<AuthResponseBody>

    // id request temp otp
    fun forgetAccount(gmail: String): Flow<AuthResponseBody>

    // id request otp
    fun validateAccount(gmail: String, otp: String): Flow<AuthResponseBody>

    //
    fun changePassword(oldPass: String, newPass: String): Flow<Nothing>

    //
    fun getAccessToken(): Flow<String>

    //
    fun getRefreshToken(): Flow<String>
}