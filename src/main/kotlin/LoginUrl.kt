package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class LoginUrl(
    val url: String,
    val forward_text: String? = null,
    val bot_username: String? = null,
    val request_write_access: Boolean? = null
) {
}