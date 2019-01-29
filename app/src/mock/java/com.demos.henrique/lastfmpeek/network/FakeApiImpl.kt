package com.demos.henrique.lastfmpeek.network

import com.demos.henrique.lastfmpeek.dto.Results
import com.demos.henrique.lastfmpeek.network.CustomResponseConverter.Companion.getResultFromDto

class FakeApiImpl : DataContract{

    private val mockAlbumResponseDto = responseBodyStringLong

    override fun getSearchFeed(resultsDataReceiver: DataReceiver<Results>, searchQuery: String) =
        resultsDataReceiver.receiveDataCallback(loadMockResults()!!)

    private fun loadMockResults() = getResultFromDto(mockAlbumResponseDto)
}