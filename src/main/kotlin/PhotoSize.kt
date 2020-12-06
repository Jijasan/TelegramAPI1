package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class PhotoSize(
    val file_id: String,
    val file_unique_id: String,
    val width: Int,
    val height: Int,
    val file_size: Int? = null
) {
}