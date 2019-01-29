package com.demos.henrique.lastfmpeek.network

import com.demos.henrique.lastfmpeek.dto.AlbumResponse
import com.demos.henrique.lastfmpeek.dto.Results
import com.google.gson.GsonBuilder

class CustomResponseConverter {

    companion object {
        fun getResultFromDto(responseBodyString: String?): Results? {
            val gson = GsonBuilder()
                .setLenient()
                .create()
            val albumResponse = gson.fromJson(responseBodyString, AlbumResponse::class.java)
            return albumResponse.results
        }
    }
}