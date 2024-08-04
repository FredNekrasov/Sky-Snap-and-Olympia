package com.fredprojects.olympia.data.di

import com.fredprojects.olympia.data.repositories.UserRepository
import com.fredprojects.olympia.domain.repository.IUserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface DataModule {
    @Binds
    fun bindUserRepository(repository: UserRepository): IUserRepository
}