package com.demos.henrique.lastfmpeek.dto


import com.google.gson.annotations.SerializedName


data class ImageItem(

	@field:SerializedName("#text")
	val imageUrl: String? = null,

	@field:SerializedName("size")
	val size: String? = null
)