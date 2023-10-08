package com.example.ohmyroomate.di

import dagger.*
import retrofit2.Retrofit
import okhttp3.OkHttpClient
import dagger.hilt.InstallIn
import com.example.ohmyroomate.utils.*
import com.example.ohmyroomate.di.annotation.*
import dagger.hilt.components.SingletonComponent
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CommonModule {

    @Provides
    @Singleton
    fun provideRequest(): Retrofit.Builder =
        Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())


    @Provides
    @Singleton
    fun providePublicRequest(
        retrofitBuilder: Retrofit.Builder,
        @PublicInterceptorOkHttpClient okHttpClient: OkHttpClient
    ): Retrofit =
        retrofitBuilder
            .client(okHttpClient)
            .build()

    @Provides
    @Singleton
    fun providePrivateRequest(
        retrofitBuilder: Retrofit.Builder,
        @PrivateInterceptorOkHttpClient okHttpClient: OkHttpClient
    ): Retrofit =
        retrofitBuilder
            .client(okHttpClient)
            .build()

    @Provides
    @Singleton
    fun provideDefaultOkhttpBuilder(
        loggingInterceptor: LoggingInterceptor
    ): OkHttpClient.Builder =
        OkHttpClient
            .Builder()
            .addInterceptor(loggingInterceptor)

    @Provides
    @Singleton
    @PublicInterceptorOkHttpClient
    fun providePublicOkHttpClient(
        okHttpClient: OkHttpClient.Builder,
        publicHeadersInterceptor: PublicHeadersInterceptor
    ): OkHttpClient = okHttpClient
        .addInterceptor(publicHeadersInterceptor)
        .build()

    @Provides
    @Singleton
    @PrivateInterceptorOkHttpClient
    fun providePrivateOkHttpClient(
        okHttpClient: OkHttpClient.Builder,
        privateHeadersInterceptor: PrivateHeadersInterceptor
    ): OkHttpClient = okHttpClient
        .addInterceptor(privateHeadersInterceptor)
        .build()

}