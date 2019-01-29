package com.demos.henrique.lastfmpeek.musicgallery.ui

import android.view.ViewGroup
import com.demos.henrique.lastfmpeek.model.Album
import com.demos.henrique.lastfmpeek.sharedui.BaseRotationalHolder
import com.demos.henrique.lastfmpeek.sharedui.CustomBaseAdapter
import com.demos.henrique.lastfmpeek.sharedui.ListableViewType

class AlbumAdapter : CustomBaseAdapter<Album>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseRotationalHolder<Album> =
        when (viewType) {
            ListableViewType.ALBUM.viewType -> DoubleSidedHolder(inflateViewForType(parent, viewType))
            else -> TODO("ViewType unknown")
        }

    override fun onBindViewHolder(p0: BaseRotationalHolder<Album>, p1: Int) = p0.bindHolder(mData[p1])
}