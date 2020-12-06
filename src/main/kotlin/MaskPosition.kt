package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class MaskPosition(
    val point: String,
    val x_shift: Double,
    val y_shift: Double,
    val scale: Double
) {
}