package com.fredprojects.olympia.domain.interactors

data class UserUseCases(
    val authorization: AuthorizationUseCase,
    val registration: UpsertUserDataUseCase,
    val deleteUser: DeleteUserDataUseCase
)