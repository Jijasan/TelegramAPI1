package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class EncryptedCredentials(
    val data: String,
    val hash: String,
    val secret: String
) {
}