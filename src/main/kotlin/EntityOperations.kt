interface EntityOperations<T: NoteEntity> {
    fun add(entity: T)
    fun delete(id: Int)
    fun update(entity: T)
    fun find(id: Int): T?
}
