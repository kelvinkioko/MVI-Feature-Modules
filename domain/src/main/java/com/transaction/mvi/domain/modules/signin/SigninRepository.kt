package com.transaction.mvi.domain.modules.signin

import com.transaction.mvi.domain.api.ApiService
import com.transaction.mvi.domain.model.UserEntity
import com.transaction.mvi.domain.model.signin.Email
import com.transaction.mvi.domain.model.signin.Password
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import java.lang.IllegalArgumentException

class SigninRepository (private val api: ApiService) {
    suspend fun signin(email: Email, password: Password) = flow<UserEntity> {
        if (email.email_address.isBlank() or password.pass.isBlank()) throw IllegalArgumentException()
        delay(2000)
        emit(UserEntity(0, "tu_1", "Kelvin Kioko", "kelvinmkioko@gmail.com", "254700000000", "28/05/2020", "28/05/2020"))
    }
}