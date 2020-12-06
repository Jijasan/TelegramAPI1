package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class Location(
    val longitude: Double,
    val latitude: Double,
    val horizontal_accuracy: Double? = null,
    val live_period: Int? = null,
    val heading: Int? = null,
    val proximity_alert_radius: Int? = null
) {
}