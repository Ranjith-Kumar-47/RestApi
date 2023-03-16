package com.example.restapi1

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface Repository {
    @GET("posts")
    fun getResult():Call<Model>
}