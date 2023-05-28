package com.jiwondev.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jiwondev.domain.usecase.MainUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch

@HiltViewModel
class MainViewModel(
    private val mainUseCase: MainUseCase
) : ViewModel() {
    fun getUserInfo(username: String) {
        viewModelScope.launch {
            mainUseCase.getUserInfo(username)
        }
    }
}