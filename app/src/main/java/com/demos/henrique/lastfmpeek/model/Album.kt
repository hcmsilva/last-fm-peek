package com.demos.henrique.lastfmpeek.model

import com.demos.henrique.lastfmpeek.dto.AlbumItem
import com.demos.henrique.lastfmpeek.network.ItemValidator
import com.demos.henrique.lastfmpeek.sharedui.CustomListable
import com.demos.henrique.lastfmpeek.sharedui.ListableViewType

class Album(albumDto: AlbumItem) : CustomListable, ItemValidator {
    val artist: String = albumDto.artist.orEmpty()
    val albumName: String = albumDto.name.orEmpty()
    val albumCoverUrl: String
    val albumDetailsUrl = albumDto.url.orEmpty()

    init {
        albumCoverUrl = if (albumDto.isValid())
            albumDto.imageList?.get(albumDto.imageList.lastIndex)!!.imageUrl!!
        else
            ""
    }

    override fun getViewType() = ListableViewType.ALBUM

    override fun isValid() = artist.isNotBlank() && albumName.isNotBlank()
}
