package com.transaction.mvi.login

import androidx.lifecycle.ViewModel
import com.transaction.common.util.StateLiveData
import com.transaction.mvi.domain.model.signin.Email
import com.transaction.mvi.domain.model.signin.Password
import com.transaction.mvi.domain.modules.signin.SigninRepository

class LoginViewModel(private val signinRepository: SigninRepository): ViewModel() {
    val state = StateLiveData(LoginState.EMPTY)

    suspend fun login(email: String, password: String) {
        signinRepository.signin(Email(email), Password(password))
    }
}