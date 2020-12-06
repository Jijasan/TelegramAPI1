package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class Poll(
    val id: String,
    val question: String,
    val options: List<PollOption>,
    val total_voter_count: Int,
    val is_closed: Boolean = true,
    val is_anonymous: Boolean = true,
    val type: String,
    val allows_multiple_answers: Boolean = true,
    val correct_option_id: Int? = null,
    val explanation: String? = null,
    val explanation_entities: List<MessageEntity>? = null,
    val open_period: Int? = null,
    val close_date: Int? = null
) {
}