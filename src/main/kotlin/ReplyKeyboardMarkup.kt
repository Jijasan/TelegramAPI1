package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class ReplyKeyboardMarkup(
    val keyboard: List<List<KeyboardButton>>,
    val resize_keyboard: Boolean? = null,
    val one_time_keyboard: Boolean? = null,
    val selective: Boolean? = null
) {

}