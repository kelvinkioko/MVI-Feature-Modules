package com.transaction.common.di

import com.squareup.moshi.Moshi
import org.koin.dsl.module

val serializationModule = module {
    single { Moshi.Builder().build() }
}