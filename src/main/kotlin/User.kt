package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class User(
    val id: Int,
    val is_bot: Boolean,
    val first_name: String,
    val last_name: String? = null,
    val username: String? = null,
    val language_code: String? = null,
    val can_join_groups: Boolean = true,
    val can_read_all_group_messages: Boolean = true,
    val supports_inline_queries: Boolean = true
) {
}