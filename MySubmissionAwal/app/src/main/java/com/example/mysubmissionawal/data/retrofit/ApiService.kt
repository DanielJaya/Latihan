package com.example.mysubmissionawal.data.retrofit

import com.example.mysubmissionawal.data.response.GitResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("users/{username}")
    fun getDetailUser(
        @Path("username") username: String,
    ): Call<GitResponse>
}