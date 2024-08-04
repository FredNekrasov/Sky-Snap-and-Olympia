package com.fredprojects.olympia.domain.interactors

import com.fredprojects.olympia.domain.model.User
import com.fredprojects.olympia.domain.repository.IUserRepository

/**
 * DeleteUserDataUseCase is used to delete user data from the database.
 * @param repository is the repository that will be used to access the data layer.
 */
class DeleteUserDataUseCase(
    private val repository: IUserRepository
) {
    /**
     * invoke is used to delete user data from the database.
     * @param user is the user model that will be deleted from the database.
     */
    suspend operator fun invoke(user: User) = repository.deleteUserData(user)
}