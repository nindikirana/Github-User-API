package com.nindikiranaf.githubuserapi.api

import com.nindikiranaf.githubuserapi.data.response.DetailUserResponse
import com.nindikiranaf.githubuserapi.data.model.User
import com.nindikiranaf.githubuserapi.data.response.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token cb436059a41b1023f120deb120bad7ecfb2d76c2")
    fun getSearchUsers(
        @Query("q")query : String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token cb436059a41b1023f120deb120bad7ecfb2d76c2")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token  cb436059a41b1023f120deb120bad7ecfb2d76c2")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token  cb436059a41b1023f120deb120bad7ecfb2d76c2")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>
}