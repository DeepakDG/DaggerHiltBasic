package com.arka.daggerhiltbasic.di.module

import com.arka.daggerhiltbasic.DogsRepository
import com.arka.daggerhiltbasic.DogsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideDogsRepository() : DogsRepository = DogsRepositoryImpl()
}