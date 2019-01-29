package com.demos.henrique.lastfmpeek.dto


import com.google.gson.annotations.SerializedName


data class Albummatches(

	@field:SerializedName("album")
	val albumList: List<AlbumItem?>? = null
)