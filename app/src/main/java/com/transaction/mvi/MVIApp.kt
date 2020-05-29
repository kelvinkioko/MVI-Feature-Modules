package com.transaction.mvi

import android.app.Application
import com.transaction.common.di.apiModule
import com.transaction.common.di.environmentModule
import com.transaction.common.di.networkModule
import com.transaction.common.di.serializationModule
import com.transaction.mvi.domain.modules.signin.signinRepositoryModule
import org.koin.core.context.startKoin

class MVIApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                environmentModule,
                networkModule,
                serializationModule,
                apiModule,
                signinRepositoryModule
            )
        }
    }
}