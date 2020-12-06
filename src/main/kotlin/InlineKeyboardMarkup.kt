package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class InlineKeyboardMarkup(
    val inline_keyboard: List<List<InlineKeyboardButton>>
) {
}