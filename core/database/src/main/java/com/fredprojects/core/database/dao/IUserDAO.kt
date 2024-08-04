package com.fredprojects.core.database.dao

import androidx.room.*
import com.fredprojects.core.database.entities.UserEntity

/**
 * IUserDao is used to manage user data in the database.
 * @property upsertUserData is used to insert or update user data in the database.
 * @property deleteUserData is used to delete user data from the database.
 * @property getUserData is used to get user data from the database.
 */
@Dao
interface IUserDAO {
    /**
     * Upsert is used to insert or update user data in the database.
     * if the user already exists in the database, it will be updated.
     * if the user does not exist in the database, it will be inserted.
     * @param user is the user entity that will be inserted or updated in the database.
     */
    @Upsert
    suspend fun upsertUserData(user: UserEntity)
    /**
     * Delete is used to delete user data from the database.
     * @param user is the user entity that will be deleted from the database.
     */
    @Delete
    suspend fun deleteUserData(user: UserEntity)
    /**
     * Query is used to get user data from the database.
     * @param email is the email of the user.
     * @param password is the password of the user.
     * @return [UserEntity] that was retrieved from the database.
     */
    @Query("SELECT * FROM users WHERE email = :email AND password = :password")
    suspend fun getUserData(email: String, password: String): UserEntity?
}