import com.github.KS2003.telegramAPI.*

fun main() {
    val bot = Bot(System.getenv("token"))
    bot.sendMessage(259571544, "Яна\nИке")
}