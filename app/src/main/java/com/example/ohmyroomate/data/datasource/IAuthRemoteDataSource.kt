package com.example.ohmyroomate.data.datasource

import com.example.ohmyroomate.data.model.AuthRequestBody
import com.example.ohmyroomate.data.model.AuthResponseBody

interface IAuthRemoteDataSource {
    suspend fun register(authRequestBody: AuthRequestBody): AuthResponseBody
    suspend fun login(authRequestBody: AuthRequestBody): AuthResponseBody
    suspend fun forgetAccount(authRequestBody: AuthRequestBody): AuthResponseBody
    suspend fun validateAccount(authRequestBody: AuthRequestBody): AuthResponseBody
    suspend fun changePassword(authRequestBody: AuthRequestBody): AuthResponseBody
}