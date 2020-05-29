package com.transaction.mvi.domain.model

/*
 *  A normal entity class can also be annoted with the entity dao to enable it as a table in a room database
 *  But I'll do that later after I have been able to log in successfully.
 */

data class UserEntity(

    val id: Int? = null,

    val user_id: String? = null,

    val name: String? = null,

    val email: String? = null,

    val phonenumber: String? = null,

    val updated_at: String? = null,

    val created_at: String? = null
)