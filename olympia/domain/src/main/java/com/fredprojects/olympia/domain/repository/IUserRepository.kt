package com.fredprojects.olympia.domain.repository

import com.fredprojects.olympia.domain.model.User

/**
 * IUserRepository interface is used by the domain layer to access the data layer.
 */
interface IUserRepository {
    /**
     * upsertUserData is used to insert or update user data in the database.
     * if the user already exists in the database, it will update the user data.
     * @param user is the user model that will be inserted or updated in the database.
     * @return the user model that was inserted or updated in the database.
     */
    suspend fun upsertUserData(user: User): User
    /**
     * deleteUserData is used to delete user data from the database.
     * @param user is the user model that will be deleted from the database.
     */
    suspend fun deleteUserData(user: User)
    /**
     * getUserData is used to get user data from the database.
     * @param email is the email of the user.
     * @param password is the password of the user.
     * @return the user model that was retrieved from the database.
     */
    suspend fun getUserData(email: String, password: String): User?
}