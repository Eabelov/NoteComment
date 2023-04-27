fun main() {
    val noteService = EntityService<Note>()
    val commentService = EntityService<Comment>()

    val note = Note(1, "My Note", "This is my first note")
    noteService.add(note)

    val comment = Comment(2, "My Comment", "This is my first comment")
    commentService.add(comment)

    noteService.update(Note(1, "Updated Note", "This is an updated note"))

    commentService.delete(2)

    val foundNote = noteService.find(1)
    val foundComment = commentService.find(2)
    println(foundNote)
}