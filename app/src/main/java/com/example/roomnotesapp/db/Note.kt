package com.example.roomnotesapp.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(

    @PrimaryKey(autoGenerate = true)
    val id : Int,
    @ColumnInfo(name = "eltitle")
    val title : String,
    val note :String
) {
}