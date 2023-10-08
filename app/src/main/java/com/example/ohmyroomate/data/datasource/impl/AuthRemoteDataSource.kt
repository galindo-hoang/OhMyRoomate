package com.example.ohmyroomate.data.datasource.impl

import com.example.ohmyroomate.data.datasource.IAuthRemoteDataSource
import com.example.ohmyroomate.data.model.AuthRequestBody
import com.example.ohmyroomate.data.model.AuthResponseBody
import javax.inject.Inject

class AuthRemoteDataSource @Inject constructor(

): IAuthRemoteDataSource {
    override suspend fun register(authRequestBody: AuthRequestBody): AuthResponseBody {
        TODO("Not yet implemented")
    }

    override suspend fun login(authRequestBody: AuthRequestBody): AuthResponseBody {
        TODO("Not yet implemented")
    }

    override suspend fun forgetAccount(authRequestBody: AuthRequestBody): AuthResponseBody {
        TODO("Not yet implemented")
    }

    override suspend fun validateAccount(authRequestBody: AuthRequestBody): AuthResponseBody {
        TODO("Not yet implemented")
    }

    override suspend fun changePassword(authRequestBody: AuthRequestBody): AuthResponseBody {
        TODO("Not yet implemented")
    }
}