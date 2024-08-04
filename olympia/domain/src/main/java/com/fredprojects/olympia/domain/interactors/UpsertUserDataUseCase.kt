package com.fredprojects.olympia.domain.interactors

import com.fredprojects.olympia.domain.model.User
import com.fredprojects.olympia.domain.repository.IUserRepository
import com.fredprojects.olympia.domain.utils.*

/**
 * UpsertUserDataUseCase is used to register a new user or update an existing user in the application.
 * @param repository is the repository that will be used to access the data layer.
 */
class UpsertUserDataUseCase(
    private val repository: IUserRepository
) {
    /**
     * invoke is used to register a new user or update an existing user in the application.
     * @param user is the user model that will be registered or updated in the application.
     * @return user data that has been registered or updated in the application.
     */
    suspend operator fun invoke(user: User) = when {
        !user.isUserNameValid() -> UserData.Error(UserDataStatus.USERNAME_NOT_VALID)
        !user.isPasswordValid() -> UserData.Error(UserDataStatus.PASSWORD_NOT_VALID)
        !user.isEmailValid() -> UserData.Error(UserDataStatus.EMAIL_NOT_VALID)
        !user.isDateOfBirthValid() -> UserData.Error(UserDataStatus.DATE_OF_BIRTH_NOT_VALID)
        else -> {
            val existingUser = repository.getUserData(user.email, user.password)
            if(existingUser == null) {
                repository.upsertUserData(user)
                UserData.Success(user)
            } else UserData.UserAlreadyExists
        }
    }
}