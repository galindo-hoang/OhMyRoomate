package com.example.ohmyroomate.utils

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class PublicHeadersInterceptor @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response =
        chain.proceed(chain.request())

}