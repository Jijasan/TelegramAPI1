package com.github.KS2003.telegramAPI

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.net.URL
import java.net.URLEncoder
import kotlin.concurrent.thread
import kotlin.math.max

class Bot(var token: String) {
    val commands = mutableMapOf<String, suspend (Message, String?) -> Unit>()

    var last = 0

    val myThread = thread {
        val url = "https://api.telegram.org/bot" + token
        while (true) {
            val input = URL(url + "/getUpdates" + "?offset=" + last.toString()).readText()
            val update = Json.decodeFromString<Request>(input)
            println(update.result.size)
            update.result.forEach { upd ->
                last = max(last, upd.update_id+1)
                if (upd.message == null)
                    return@forEach
                if (upd.message.text != null) {
                    commands.forEach { (command, functor) ->
                        if (command in upd.message.text)
                            GlobalScope.launch { functor.invoke(upd.message, null)}
                    }
                }
            }
            Thread.sleep(1000)
        }
    }

    fun sendMessage(
        chat: Int, text: String, parse_mode: String? = null, entities: List<MessageEntity>? = null,
        disable_web_page_preview: Boolean? = null, disable_notification: Boolean? = null,
        reply_to_message_id: Int? = null, allow_sending_without_reply: Boolean? = null,
        reply_markup: ReplyKeyboardMarkup? = null
    ) {
        val url = "https://api.telegram.org/bot" + token

        URL(
            url + "/sendMessage?chat_id=" + chat + "&text=" + text
                    + if (parse_mode != null) "&parse_mode=" + parse_mode else ""
                    + if (entities != null) "&entities=" + Json.encodeToString(entities) else ""
                    + if (disable_web_page_preview != null)
                        "&disable_web_page_preview=" + disable_web_page_preview.toString() else ""
                    + if (disable_notification != null)
                        "&disable_notification=" + disable_notification.toString() else ""
                    + if (reply_to_message_id != null)
                        "&reply_to_message_id=" + reply_to_message_id.toString() else ""
                    + if (allow_sending_without_reply != null)
                        "&allow_sending_without_reply=" + allow_sending_without_reply.toString() else ""
                    + if (reply_markup != null) "&reply_markup=" + Json.encodeToString(reply_markup) else ""
        ).readText()
    }

    fun onCommand(command: String, functor: suspend (Message, String?) -> Unit){
        commands += Pair(command, functor)
    }

}