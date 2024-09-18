package com.example.retrofit_practice_project

import retrofit2.Response
import retrofit2.http.GET

interface ResponseApi {
    @GET("/division_and_district.json")
    suspend fun getResponse(): Response<DivisionResponse>
}