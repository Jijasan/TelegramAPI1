package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class InlineKeyboardButton(
    val text: String,
    val url: String? = null,
    val login_url: LoginUrl? = null,
    val callback_data: String? = null,
    val switch_inline_query: String? = null,
    val switch_inline_query_current_chat: String? = null,
    val callback_game: CallbackGame,
    val pay: Boolean? = null
) {
}