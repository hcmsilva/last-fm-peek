package com.demos.henrique.lastfmpeek.dto


import com.google.gson.annotations.SerializedName


data class Results(

	@field:SerializedName("opensearch:Query")
	val opensearchQuery: OpensearchQuery? = null,

	@field:SerializedName("@attr")
	val attr: Attr? = null,

	@field:SerializedName("opensearch:itemsPerPage")
	val opensearchItemsPerPage: String? = null,

	@field:SerializedName("albummatches")
	val albummatches: Albummatches? = null,

	@field:SerializedName("opensearch:startIndex")
	val opensearchStartIndex: String? = null,

	@field:SerializedName("opensearch:totalResults")
	val opensearchTotalResults: String? = null
)