package com.example.ohmyroomate.data.repository

import com.example.ohmyroomate.data.datasource.*
import com.example.ohmyroomate.data.model.AuthResponseBody
import com.example.ohmyroomate.domain.repository.IAuthRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepository @Inject constructor(
    private val remote: IAuthRemoteDataSource,
    private val local: IAuthLocalDataSource,
) : IAuthRepository {
    override fun register(gmail: String, password: String, name: String): Flow<AuthResponseBody> {
        TODO("Not yet implemented")
    }

    override fun login(gmail: String, password: String): Flow<AuthResponseBody> {
        TODO("Not yet implemented")
    }

    override fun forgetAccount(gmail: String): Flow<AuthResponseBody> {
        TODO("Not yet implemented")
    }

    override fun validateAccount(gmail: String, otp: String): Flow<AuthResponseBody> {
        TODO("Not yet implemented")
    }

    override fun changePassword(oldPass: String, newPass: String): Flow<Nothing> {
        TODO("Not yet implemented")
    }

    override fun getAccessToken(): Flow<String> {
        TODO("Not yet implemented")
    }

    override fun getRefreshToken(): Flow<String> {
        TODO("Not yet implemented")
    }
}