package com.example.roomnotesapp.db

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Insert
import androidx.room.Query


@Database(
    entities = [Note::class],
    version = 1
)
@Dao
interface DAO {
    @Insert
    fun addNote(note : Note)

    @Query("SELECT * FROM Note")
    fun getAllNotes() : List<Note>

    @Insert
    fun addMultipleNotes (vararg note: Note)

}