object NotesRepository {
    fun add(chatId: Long, text: String) {
        val sql = "INSERT INTO notes(chat_id, text) VALUES (?, ?)"
        Database.conn.prepareStatement(sql).use{
            it.setLong(1, chatId)
            it.setString(2, text)
            it.executeUpdate()
        }
    }

    fun list(chatId: Long) {

    }

    fun remove(chatId: Long) {

    }

    fun clear(chatId: Long) {

    }
}