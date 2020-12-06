package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class PassportFile(
    val ile_id: String,
    val file_unique_id: String,
    val file_size: Int,
    val file_date: Int
) {
}