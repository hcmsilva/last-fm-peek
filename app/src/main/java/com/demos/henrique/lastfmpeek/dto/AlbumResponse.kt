package com.demos.henrique.lastfmpeek.dto


import com.google.gson.annotations.SerializedName


data class AlbumResponse(

    @field:SerializedName("results")
    val results: Results? = null
)