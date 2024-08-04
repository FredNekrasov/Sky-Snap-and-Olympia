package com.fredprojects.olympia.domain.utils

/**
 * UserDataStatus enum for [UserData] class. It is used to indicate the status of the user data.
 * @property SUCCESS is used to indicate that the user data was successfully saved.
 * @property USER_ALREADY_EXISTS is used to indicate that the user already exists.
 * @property USERNAME_NOT_VALID is used to indicate that the username is not valid.
 * @property PASSWORD_NOT_VALID is used to indicate that the password is not valid.
 * @property EMAIL_NOT_VALID is used to indicate that the email is not valid.
 * @property DATE_OF_BIRTH_NOT_VALID is used to indicate that the date of birth is not valid.
 */
enum class UserDataStatus {
    SUCCESS,
    USER_ALREADY_EXISTS,
    USERNAME_NOT_VALID,
    PASSWORD_NOT_VALID,
    EMAIL_NOT_VALID,
    DATE_OF_BIRTH_NOT_VALID
}