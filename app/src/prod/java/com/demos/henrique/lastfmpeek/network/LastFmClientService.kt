package com.demos.henrique.lastfmpeek.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LastFmClientService {
    @GET("/2.0/") fun getAlbums(
        @Query("album") albumOrArtist: String,
        @Query("api_key") apiKey: String,
        @Query("method") apiMethod: String = ApiMethod.ALBUM_SEARCH.method,
        @Query("format") responseFormat: String = ApiFormat.JSON.format
    ): Call<ResponseBody>

    enum class ApiMethod(val method: String) {
        ALBUM_SEARCH("album.search")
    }

    enum class ApiFormat(val format: String) {
        JSON("json"),
        XML("xml")
    }
}
