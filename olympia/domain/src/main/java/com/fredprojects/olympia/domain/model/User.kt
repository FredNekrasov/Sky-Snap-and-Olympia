package com.fredprojects.olympia.domain.model

import java.time.LocalDate

/**
 * Data class for User data. Contains all the fields for the user.
 * @param login the username of the user
 * @param password the password of the user
 * @param email the email of the user
 * @param gender the gender of the user
 * @param dateOfBirth the date when the user was born
 * @param enterDate the date when the user registered
 * @param id the identifier of the user
 */
data class User(
    val login: String,
    val password: String,
    val email: String,
    val gender: Boolean,
    val dateOfBirth: String,
    val enterDate: String = LocalDate.now().toString(),
    val id: Int? = null
)