package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class Update(
    val update_id: Int,
    val message: Message? = null
) {
}