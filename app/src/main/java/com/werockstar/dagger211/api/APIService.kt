package com.werockstar.dagger211.api

import com.werockstar.dagger211.data.UserResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface APIService {

    @GET("users/{user}")
    fun getUser(@Path("user") user: String): Observable<UserResponse>
}