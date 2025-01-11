package com.example.myapplication.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AmphibiansImage(
    val id:String,
    @SerialName("img_src")
    val imageSrc:String
)
