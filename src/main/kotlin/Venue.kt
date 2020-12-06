package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class Venue(
    val location: Location,
    val title: String,
    val address: String,
    val foursquare_id: String? = null,
    val foursquare_type: String? = null,
    val google_place_id: String? = null,
    val google_place_type: String? = null
) {
}