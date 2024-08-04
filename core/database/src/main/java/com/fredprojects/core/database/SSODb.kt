package com.fredprojects.core.database

import androidx.room.RoomDatabase
import com.fredprojects.core.database.dao.IUserDAO

//@Database(
//    entities = [UserEntity::class],
//    version = 1,
//    exportSchema = false
//)
internal abstract class SSODb : RoomDatabase() {
    abstract val userDAO: IUserDAO
    companion object {
        // The name of the database
        const val NAME = "sso.db"
    }
}