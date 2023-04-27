import org.junit.Assert.*
import org.junit.Test

class EntityServiceTest {

    @Test
    fun testAdd() {
        val noteService = EntityService<Note>()
        val note = Note(1, "My Note", "This is my first note")

        noteService.add(note)

        val foundNote = noteService.find(1)
        assertNotNull(foundNote)
        assertEquals(note.id, foundNote!!.id)
        assertEquals(note.title, foundNote.title)
        assertEquals(note.text, foundNote.text)
    }

    @Test
    fun testDelete() {
        val noteService = EntityService<Note>()
        val note = Note(1, "My Note", "This is my first note")
        noteService.add(note)

        noteService.delete(1)

        val foundNote = noteService.find(1)
        assertNull(foundNote)
        assertTrue(note.isDeleted)
    }
}
