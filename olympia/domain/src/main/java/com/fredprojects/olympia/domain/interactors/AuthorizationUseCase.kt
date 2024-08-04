package com.fredprojects.olympia.domain.interactors

import com.fredprojects.olympia.domain.model.User
import com.fredprojects.olympia.domain.repository.IUserRepository

/**
 * AuthorizationUseCase is used to authorize the user.
 * @param repository is the repository that will be used to access the data layer.
 */
class AuthorizationUseCase(
    private val repository: IUserRepository
) {
    /**
     * invoke is used to authorize the user.
     * @param email is the email of the user.
     * @param password is the password of the user.
     * @return the user model that was authorized.
     */
    suspend operator fun invoke(email: String, password: String): User? = repository.getUserData(email, password)
}