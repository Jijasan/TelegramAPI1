package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class PassportData(
    val data: List<EncryptedPassportElement>,
    val credentials: EncryptedCredentials
) {
}