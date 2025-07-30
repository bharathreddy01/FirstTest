package com.example.firsttest

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {
    private val _clickCount = MutableStateFlow(0)
    val clickCount: StateFlow<Int> = _clickCount

    fun onButtonClick() {
        _clickCount.value += 1

    }
}