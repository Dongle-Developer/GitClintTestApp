package com.devleop.dongle.gitclinttestapp.remote

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object GithubSearchServiceProvider {

    fun providerGithubSearchService(debug: Boolean, baseUrl: String) =
        providerGithubSearchService(
            baseUrl,
            providerOkHttpClint(providerLoggingInterceptor(debug)),
            Gson()
        )

    private fun providerGithubSearchService(
        baseUrl: String,
        okHttpClient: OkHttpClient,
        gson: Gson
    ) = Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(okHttpClient)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
        .create(GithubSearchService::class.java)

    private fun providerOkHttpClint(httpLoggingInterceptor: HttpLoggingInterceptor) = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

    private fun providerLoggingInterceptor(debug: Boolean) = HttpLoggingInterceptor().apply {
        level =
            if (debug) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
    }
}