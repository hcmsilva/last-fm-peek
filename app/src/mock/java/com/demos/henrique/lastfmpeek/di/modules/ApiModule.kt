package com.demos.henrique.lastfmpeek.di.modules

import com.demos.henrique.lastfmpeek.network.DataContract
import com.demos.henrique.lastfmpeek.network.FakeApiImpl
import dagger.Module
import dagger.Provides

@Module
class ApiModule(private val apiBaseUrl: String, private val apiKey: String) {
    @Provides
    fun provideApiClient(): DataContract = FakeApiImpl()
}