package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class ChatPermissions(
    val can_send_messages: Boolean = true,
    val can_send_media_messages: Boolean = true,
    val can_send_polls: Boolean = true,
    val can_send_other_messages: Boolean = true,
    val can_add_web_page_previews: Boolean = true,
    val can_change_info: Boolean = true,
    val can_invite_users: Boolean = true,
    val can_pin_messages: Boolean = true
) {
}