package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class OrderInfo(
    val name: String? = null,
    val phone_number: String? = null,
    val email: String? = null,
    val shipping_address: ShippingAddress? = null
) {
}