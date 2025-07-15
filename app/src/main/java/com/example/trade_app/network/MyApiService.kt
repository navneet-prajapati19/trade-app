package com.example.trade_app.network

import com.example.trade_app.model.ApiResponse
import com.example.trade_app.model.LoginRequest
import com.example.trade_app.model.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface MyApiService {

    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest): Response<ApiResponse<User>>
}
