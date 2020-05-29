package com.transaction.common.configuration

sealed class Environment(val url: String) {
    object Production : Environment ("http://64.227.64.76")
}