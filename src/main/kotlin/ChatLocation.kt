package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class ChatLocation(
    val location: Location,
    val address: String
) {
}