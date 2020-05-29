package com.transaction.common.util

import androidx.lifecycle.MutableLiveData

/**
 * Helper class for non-nullable live data
 */
class StateLiveData<T : Any>(value: T) : MutableLiveData<T>(value) {
    override fun getValue(): T =
        requireNotNull<T>(super.getValue()) { "The value should never have been null!" }

    fun update(updateBlock: T.() -> T) {
        val newValue = updateBlock.invoke(value)
        postValue(newValue)
    }
}
