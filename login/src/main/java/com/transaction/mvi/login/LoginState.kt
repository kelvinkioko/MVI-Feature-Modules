package com.transaction.mvi.login

import com.transaction.common.util.Lce
import com.transaction.mvi.domain.model.UserEntity

data class LoginState(val user: Lce<UserEntity>) {
    companion object {
        val EMPTY = LoginState(Lce.Empty)
    }
}