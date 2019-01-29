package com.demos.henrique.lastfmpeek.musicgallery

import com.demos.henrique.lastfmpeek.dto.AlbumItem
import com.demos.henrique.lastfmpeek.dto.Results
import com.demos.henrique.lastfmpeek.model.Album
import com.demos.henrique.lastfmpeek.musicgallery.MusicGalleryContract.GalleryPresenter
import com.demos.henrique.lastfmpeek.musicgallery.MusicGalleryContract.GalleryView
import com.demos.henrique.lastfmpeek.network.DataContract
import com.demos.henrique.lastfmpeek.network.DataReceiver

class GalleryPresenter(val view: GalleryView, private val apiClient: DataContract) : GalleryPresenter,
    DataReceiver<Results> {
    private val TAG = "PRESENTER"

    override fun getArtistData(artist: String) {
        view.showLoading(true)
        apiClient.getSearchFeed(this, artist)
    }

    override fun receiveDataCallback(data: Results) {
        var albumList = getAlbumListFromData(data.albummatches?.albumList)
        if (albumList == null)
            albumList = listOf()

        with(view) {
            displayAlbums(albumList)
            showLoading(false)
        }
    }

    internal fun getAlbumListFromData(data: List<AlbumItem?>?): List<Album>? =
        data
            ?.asSequence()
            ?.filter { albumItem -> albumItem != null && albumItem.isValid() }
            ?.map { albumItem -> Album(albumItem as AlbumItem) }
            ?.toList()
}
