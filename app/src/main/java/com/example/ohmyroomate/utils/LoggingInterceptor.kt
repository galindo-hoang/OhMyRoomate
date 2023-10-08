package com.example.ohmyroomate.utils

import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Inject

class LoggingInterceptor @Inject constructor() : Interceptor {
    private val loggingInterceptor =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        loggingInterceptor.intercept(chain)
        val response = chain.proceed(request)
        loggingInterceptor.intercept(chain)
        return response
    }
}