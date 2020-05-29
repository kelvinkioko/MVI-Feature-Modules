package com.transaction.common.di

import com.transaction.common.configuration.Environment
import com.transaction.mvi.domain.api.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single {
        Retrofit.Builder()
            .baseUrl(get<Environment>().url)
            .build()
    }
    single { get<Retrofit>().create(ApiService::class.java) }
}