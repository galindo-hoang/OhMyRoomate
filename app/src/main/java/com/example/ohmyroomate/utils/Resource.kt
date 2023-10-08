package com.example.ohmyroomate.utils

sealed class Resource<out T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(codeStatus: T, message: String) : Resource<T>(codeStatus, message)
    data object Loading : Resource<Nothing>()
}