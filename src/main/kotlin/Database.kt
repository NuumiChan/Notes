import java.sql.DriverManager

object Database {
    private const val URL = "jdbc:sqlite:bot.db"

    val conn = DriverManager.getConnection(URL)

    init {
        conn.createStatement().use {
            """
                CREATE TABLE IF NOT EXISTS notes (
                    notes_id INTEGER PRIMARY KEY AUTOINCREMENT,
                    chat_id INTEGER NOT NULL,
                    text TEXT NPT NULL
                )
            """
        }
    }
}