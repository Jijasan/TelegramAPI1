package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class Request(
    val ok: Boolean,
    val result: List<Update>
) {
}