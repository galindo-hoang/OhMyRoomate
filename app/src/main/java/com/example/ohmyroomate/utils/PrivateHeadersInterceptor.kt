package com.example.ohmyroomate.utils

import com.example.ohmyroomate.domain.repository.IAuthRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class PrivateHeadersInterceptor @Inject constructor(
    private val authRepository: IAuthRepository
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val accessToken = runBlocking {
            withContext(Dispatchers.IO) {
                val deferred = async { authRepository.getAccessToken().first() }
                deferred.await()
            }
        }
        val parsedRequest = request.newBuilder()
            .header("Authorization", "Bearer $accessToken")
            .build()
        return chain.proceed(parsedRequest)
    }
}