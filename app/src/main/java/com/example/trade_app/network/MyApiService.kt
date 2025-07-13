package com.example.trade_app.network

import com.example.trade_app.JsonResponse
import retrofit2.Response
import retrofit2.http.GET

interface MyApiService {

    @GET("posts/1")
    suspend fun getGreeting(): Response<JsonResponse>
}
