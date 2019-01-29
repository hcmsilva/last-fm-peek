package com.demos.henrique.lastfmpeek.musicgallery

import com.demos.henrique.lastfmpeek.model.Album

interface MusicGalleryContract {
    interface GalleryPresenter {
        fun getArtistData(artist: String)
    }

    interface GalleryView {
        fun showLoading(isLoading: Boolean)
        fun displayAlbums(albumList: List<Album>)
    }
}