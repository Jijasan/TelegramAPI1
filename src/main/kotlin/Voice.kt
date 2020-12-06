package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class Voice(
    val file_id: String,
    val file_unique_id: String,
    val duration: Int,
    val mime_type: String? = null,
    val file_size: Int? = null
) {
}