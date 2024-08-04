package com.fredprojects.olympia.data.repositories

import com.fredprojects.core.database.dao.IUserDAO
import com.fredprojects.olympia.data.mappers.toUser
import com.fredprojects.olympia.data.mappers.toUserEntity
import com.fredprojects.olympia.domain.model.User
import com.fredprojects.olympia.domain.repository.IUserRepository
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val userDAO: IUserDAO
) : IUserRepository {
    override suspend fun upsertUserData(user: User): User {
        userDAO.upsertUserData(user.toUserEntity())
        return user
    }

    override suspend fun deleteUserData(user: User) = userDAO.deleteUserData(user.toUserEntity())

    override suspend fun getUserData(
        email: String, password: String
    ): User? = userDAO.getUserData(email, password)?.toUser()
}