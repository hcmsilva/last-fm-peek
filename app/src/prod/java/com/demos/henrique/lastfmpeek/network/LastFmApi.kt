package com.demos.henrique.lastfmpeek.network

import android.util.Log
import com.demos.henrique.lastfmpeek.BuildConfig
import com.demos.henrique.lastfmpeek.dto.Results
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class LastFmApi(baseUrl: String, private val apiKey: String) : DataContract {

    private val gson = GsonBuilder()
        .setLenient()
        .create()
    private val client: OkHttpClient
    private val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor()

    init {
        if (BuildConfig.DEBUG)
            interceptor.level = HttpLoggingInterceptor.Level.BODY
        else
            interceptor.level = HttpLoggingInterceptor.Level.NONE
        client = OkHttpClient.Builder().addInterceptor(interceptor).build()
    }

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(client)
        .build()

    override fun getSearchFeed(resultsDataReceiver: DataReceiver<Results>, searchQuery: String) {
        val apiService = retrofit.create(LastFmClientService::class.java)
        val request = apiService.getAlbums(searchQuery, apiKey)

        request.enqueue(object : Callback<ResponseBody> {
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                Log.e("RETROFIT_API", t.message)
                resultsDataReceiver.receiveDataCallback(Results())
            }

            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                val results = CustomResponseConverter.getResultFromDto(response.body()?.string())!!
                resultsDataReceiver.receiveDataCallback(results)
            }
        })
    }
}