package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class Contact(
    val phone_number: String,
    val first_name: String,
    val last_name: String? = null,
    val user_id: Int? = null,
    val vcard: String? = null
) {
}