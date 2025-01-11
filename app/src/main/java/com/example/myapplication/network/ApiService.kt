package com.example.myapplication.network

import com.example.myapplication.model.AmphibiansImage
import retrofit2.http.GET

interface ApiService {

    @GET("photos")
    suspend fun getImages():List<AmphibiansImage>
}