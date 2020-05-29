package com.transaction.common.di

import com.transaction.common.configuration.Environment
import org.koin.dsl.module

val environmentModule = module {
    single<Environment> { Environment.Production }
}