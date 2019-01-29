package com.demos.henrique.lastfmpeek.dto


import com.google.gson.annotations.SerializedName


data class Attr(

	@field:SerializedName("for")
	val jsonMemberFor: String? = null
)