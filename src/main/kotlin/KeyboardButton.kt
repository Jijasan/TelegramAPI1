package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class KeyboardButton(
    val text: String,
    val request_contact: Boolean?,
    val request_location: Boolean?,
    val request_poll: KeyboardButtonPollType?
) {
}