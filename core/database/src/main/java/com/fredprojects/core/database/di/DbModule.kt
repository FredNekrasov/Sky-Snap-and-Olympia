package com.fredprojects.core.database.di

import android.app.Application
import androidx.room.Room
import com.fredprojects.core.database.SSODb
import com.fredprojects.core.database.dao.IUserDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DbModule {
    @Singleton
    @Provides
    fun provideDb(app: Application): SSODb {
        return Room.databaseBuilder(app, SSODb::class.java, SSODb.NAME)
            .fallbackToDestructiveMigration()
            .build()
    }
    @Singleton
    @Provides
    fun provideUserDAO(db: SSODb): IUserDAO = db.userDAO
}