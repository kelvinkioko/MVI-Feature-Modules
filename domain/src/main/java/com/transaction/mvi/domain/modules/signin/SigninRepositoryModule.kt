package com.transaction.mvi.domain.modules.signin

import org.koin.dsl.module

/**
 * Initialize the module here and inside it create a single repository
 * instance that will be used every time we want to login
 * Then go back to com.transaction.mvi.MVIApp and add add this val to the koin vars
 */
val signinRepositoryModule = module {
    single { SigninRepository(get()) }
}