import java.sql.DriverManager
import java.io.File


object Database {
    private val dbFile = File("notes.db")
    private const val URL = "jdbc:sqlite:notes.db"
    val conn = DriverManager.getConnection(URL)

    init {
        conn.createStatement().use {
            it.execute(
                """
                CREATE TABLE IF NOT EXISTS notes (
                    notes_id INTEGER PRIMARY KEY AUTOINCREMENT,
                    chat_id INTEGER NOT NULL,
                    text TEXT NOT NULL
                )
            """.trimIndent()
            )
        }
    }
}