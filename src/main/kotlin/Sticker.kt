package com.github.KS2003.telegramAPI

import kotlinx.serialization.Serializable

@Serializable
class Sticker(
    val file_id: String,
    val file_unique_id: String,
    val width: Int,
    val height: Int,
    val is_animated: Boolean = false,
    val thumb: PhotoSize? = null,
    val emoji: String? = null,
    val set_name: String? = null,
    val mask_position: MaskPosition? = null,
    val file_size: Int? = null
) {
}