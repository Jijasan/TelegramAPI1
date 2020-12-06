package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class SuccessfulPayment(
    val currency: String,
    val total_amount: Int,
    val invoice_payload: String? = null,
    val shipping_option_id: String? = null,
    val order_info: OrderInfo? = null,
    val telegram_payment_charge_id: String,
    val provider_payment_charge_id: String
) {
}