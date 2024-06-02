package com.example.dijikala.di

import android.content.Context
import com.example.dijikala.data.datastore.DataStoreRepository
import com.example.dijikala.data.datastore.DataStoreRepositoryImpl
import com.example.dijikala.data.remote.HomeApiInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HomeAPiInterfaceModule {

    @Singleton
    @Provides

    fun provideHomeApiService(retrofit: Retrofit): HomeApiInterface =
        retrofit.create(HomeApiInterface::class.java)


}