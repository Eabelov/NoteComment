abstract class NoteEntity(
    val id: Int,
    var title: String,
    var text: String,
    var isDeleted: Boolean = false
) {
    fun delete() {
        isDeleted = true
    }

    fun restore() {
        isDeleted = false
    }

    abstract fun update(title: String, text: String)
}