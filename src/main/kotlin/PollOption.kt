package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class PollOption(
    val text: String,
    val voter_count: Int
) {
}