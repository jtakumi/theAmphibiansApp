package com.example.myapplication.data

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {
    val amphibiansRepository: AmphibiansRepository
}

class DefaultAppContainer {
    private val baseUrl = "https://android-kotlin-fun-mars-server.appspot.com/amphibians"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(/* factory = */ Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(baseUrl)
        .build()
}