package com.jiwondev.domain

import com.jiwondev.domain.entity.UserInfo

interface MainRepository {
    suspend fun getUserInfo(query: String) : UserInfo
}