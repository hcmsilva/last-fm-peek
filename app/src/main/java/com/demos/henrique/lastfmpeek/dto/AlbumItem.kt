package com.demos.henrique.lastfmpeek.dto


import com.demos.henrique.lastfmpeek.network.ItemValidator
import com.google.gson.annotations.SerializedName


data class AlbumItem(

	@field:SerializedName("image")
	val imageList: List<ImageItem?>? = null,

	@field:SerializedName("mbid")
	val mbid: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("streamable")
	val streamable: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("url")
	val url: String? = null
) : ItemValidator {
	override fun isValid(): Boolean =
		!name.isNullOrBlank() && !artist.isNullOrBlank() &&
		imageList != null &&
		imageList.isNotEmpty() &&
		imageList.last() != null &&
		!imageList.last()!!.imageUrl.isNullOrEmpty()
}