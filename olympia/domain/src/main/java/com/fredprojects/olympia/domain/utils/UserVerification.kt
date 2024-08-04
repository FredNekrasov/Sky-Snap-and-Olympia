package com.fredprojects.olympia.domain.utils

import com.fredprojects.olympia.domain.model.User
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

fun User.isUserNameValid() = login.isNotBlank()
fun User.isPasswordValid() = password.isNotBlank() && password.length >= 6
fun User.isEmailValid() = email.isNotBlank() && email.contains("@")
fun User.isDateOfBirthValid() = try {
    if (Regex("""^\d{2}\.\d{2}\.\d{4}$""").matches(dateOfBirth)) {
        val date = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd.MM.yyyy"))
        date < LocalDate.now().minusYears(4L)
    } else false
} catch (e: DateTimeParseException) {
    false
}