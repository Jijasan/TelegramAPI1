package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class Document(
    val file_id: String,
    val file_unique_id: String,
    val thumb: PhotoSize? = null,
    val file_name: String? = null,
    val mime_type: String? = null,
    val file_size: Int? = null
) {
}