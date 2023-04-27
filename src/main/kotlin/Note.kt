class Note(
    id: Int,
    title: String,
    text: String,
    isDeleted: Boolean = false
) : NoteEntity(id, title, text, isDeleted) {
    override fun update(title: String, text: String) {
        this.title = title
        this.text = text
    }
}