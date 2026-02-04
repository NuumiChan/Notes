import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId
import java.sql.DriverManager
import java.io.File


fun main() {
    val token = "Мой токен"

    val bot = bot {
        this.token = token

        dispatch {
            command("start") {
                bot.sendMessage(
                    chatId = ChatId.fromId(message.chat.id),
                    text = "Привет, Мир!\nЗдесь будут твои заметки, спасибо)"
                )
            }

            command("add") {
//                NotesRepository.add(message.chat.id, text)
                bot.sendMessage(
                    ChatId.fromId(message.chat.id), "Сохраненно"
                )
            }

//            text {
//                NotesRepository.add(message.chat.id, text)
//                bot.sendMessage(
//                    ChatId.fromId(message.chat.id), "Сохраненно"
//                )
//            }
        }
    }

    bot.startPolling()
}