package com.fredprojects.olympia.domain.utils

import com.fredprojects.olympia.domain.model.User

/**
 * UserData is used to determine the status of the user.
 *
 * @param user the user data that was inserted or updated
 * @param status the status of the user
 *
 * @property Success in case the user was successfully inserted or updated
 * @property UserAlreadyExists in case the user already exists in the database
 * @property Error in case of an error during user registration or login process
 */
sealed class UserData(val user: User?, val status: UserDataStatus) {
    class Success(user: User) : UserData(user, UserDataStatus.SUCCESS)
    data object UserAlreadyExists : UserData(null, UserDataStatus.USER_ALREADY_EXISTS)
    class Error(status: UserDataStatus) : UserData(null, status)
}