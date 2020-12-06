package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class Dice(
    val emoji: String,
    val value: Int
) {
}