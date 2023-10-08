package com.example.ohmyroomate.di.annotation

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class PublicInterceptorOkHttpClient

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class PrivateInterceptorOkHttpClient
