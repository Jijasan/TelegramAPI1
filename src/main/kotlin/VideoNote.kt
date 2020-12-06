package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class VideoNote(
    val file_id: String,
    val file_unique_id: String,
    val length: Int,
    val duration: Int,
    val thumb: PhotoSize? = null,
    val file_size: Int?
) {
}