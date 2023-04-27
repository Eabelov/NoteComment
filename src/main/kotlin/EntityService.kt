class EntityService<T: NoteEntity> : EntityOperations<T> {
    private val entities = mutableListOf<T>()

    override fun add(entity: T) {
        entities.add(entity)
    }

    override fun delete(id: Int) {
        val entity = find(id)
        entity?.delete()
    }

    override fun update(entity: T) {
        val existingEntity = find(entity.id)
        existingEntity?.let {
            it.title = entity.title
            it.text = entity.text
        }
    }

    override fun find(id: Int): T? {
        return entities.find { it.id == id && !it.isDeleted }
    }
}
