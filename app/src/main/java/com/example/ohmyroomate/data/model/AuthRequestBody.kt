package com.example.ohmyroomate.data.model

import kotlinx.serialization.Serializable

@Serializable
data class AuthRequestBody(
    private val gmail: String?,
    private val password: String?,
    private val otp: String?,
)
