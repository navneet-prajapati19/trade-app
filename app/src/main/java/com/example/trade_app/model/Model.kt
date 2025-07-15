package com.example.trade_app.model

import com.google.gson.annotations.SerializedName

data class ApiResponse<T>(
    val status: Int,
    val message: String,
    val data: T
)

data class LoginRequest(val email: String, val password: String)
data class User(@SerializedName("access_token") val accessToken: String, @SerializedName("refresh_token") val refreshToken: String)