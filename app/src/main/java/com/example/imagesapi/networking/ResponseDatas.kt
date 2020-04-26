package com.example.imagesapi.networking

data class Image(
    val id: Long,
    val tags: String,
    val largeImageURL: String,
    val likes: Long
)

data class ImageResponse(
    val hits: List<Image>
)