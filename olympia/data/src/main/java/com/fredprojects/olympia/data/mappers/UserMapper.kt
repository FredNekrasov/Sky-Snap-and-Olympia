package com.fredprojects.olympia.data.mappers

import com.fredprojects.core.database.entities.UserEntity
import com.fredprojects.olympia.domain.model.User

internal fun User.toUserEntity() = UserEntity(
    login = login,
    password = password,
    email = email,
    gender = gender,
    dateOfBirth = dateOfBirth,
    enterDate = enterDate,
    id = id
)
internal fun UserEntity.toUser() = User(
    login = login,
    password = password,
    email = email,
    gender = gender,
    dateOfBirth = dateOfBirth,
    enterDate = enterDate,
    id = id
)