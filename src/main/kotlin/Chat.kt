package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class Chat(
    val id: Int,
    val type: String,
    val title: String? = null,
    val username: String? = null,
    val first_name: String? = null,
    val last_name: String? = null,
    val photo: ChatPhoto? = null,
    val bio: String? = null,
    val description: String? = null,
    val invite_link: String? = null,
    val pinned_message: Message? = null,
    val permissions: ChatPermissions? = null,
    val slow_mode_delay: Int? = null,
    val sticker_set_name: String? = null,
    val can_set_sticker_set: Boolean = true,
    val linked_chat_id: Int? = null,
    val location: ChatLocation? = null
) {
}