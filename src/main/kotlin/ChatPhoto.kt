package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class ChatPhoto(
    val small_file_id: String,
    val small_file_unique_id: String,
    val big_file_id: String,
    val big_file_unique_id: String
) {
}