package com.example.myapplication.data

import com.example.myapplication.model.AmphibiansImage
import com.example.myapplication.network.ApiService

interface AmphibiansRepository {
    suspend fun getImages(): List<AmphibiansImage>
}

class NetworkAmphibiansRepository(
    private val apiService: ApiService
) : AmphibiansRepository {
    override suspend fun getImages(): List<AmphibiansImage> = apiService.getImages()

}

