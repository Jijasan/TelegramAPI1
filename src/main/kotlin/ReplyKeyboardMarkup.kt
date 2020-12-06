package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class ReplyKeyboardMarkup(
    val keyboard: List<List<KeyboardButton>>,
    val resize_keyboard: Boolean?,
    val one_time_keyboard: Boolean?,
    val selective: Boolean?
) {

}