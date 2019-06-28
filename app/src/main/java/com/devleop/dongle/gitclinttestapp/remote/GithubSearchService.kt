package com.devleop.dongle.gitclinttestapp.remote

import com.devleop.dongle.gitclinttestapp.remote.model.GitRepositoryData
import com.devleop.dongle.gitclinttestapp.remote.model.UserData
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubSearchService {

    @GET("/users/{userName}")
    fun getUserData(@Path("userName") userName: String): Single<UserData>

    @GET("/users/{userName}/repos")
    fun getUserRepositoryData(@Path("userName") userName: String): Single<List<GitRepositoryData>>
}


