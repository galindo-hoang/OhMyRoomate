package com.example.ohmyroomate.data.model

import kotlinx.serialization.Serializable

@Serializable
data class AuthResponseBody(
    private val id: String,
    private val requestId: String,
    private val accessToken: String,
    private val refreshToken: String,
)