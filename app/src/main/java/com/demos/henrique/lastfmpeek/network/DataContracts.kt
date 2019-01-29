package com.demos.henrique.lastfmpeek.network

import com.demos.henrique.lastfmpeek.dto.Results

interface DataContract {
    fun getSearchFeed(resultsDataReceiver: DataReceiver<Results>, searchQuery: String)
}

interface DataReceiver<T> {
    fun receiveDataCallback(data: T)
}