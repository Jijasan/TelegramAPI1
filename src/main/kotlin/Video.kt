package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class Video(
    val file_id: String,
    val file_unique_id: String,
    val width: Int,
    val height: Int,
    val duration: Int,
    val thumb: PhotoSize? = null,
    val file_name: String? = null,
    val mime_type: String? = null,
    val file_size: Int? = null
) {
}