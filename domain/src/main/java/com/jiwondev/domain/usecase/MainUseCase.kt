package com.jiwondev.domain.usecase

import com.jiwondev.domain.MainRepository
import com.jiwondev.domain.entity.UserInfo


class MainUseCase(private val repository: MainRepository) {
    suspend fun getUserInfo(query: String) : UserInfo {
        return repository.getUserInfo(query)
    }
}