package com.demos.henrique.lastfmpeek.sharedui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demos.henrique.lastfmpeek.R

abstract class CustomBaseAdapter<T : CustomListable> : RecyclerView.Adapter<BaseRotationalHolder<T>>() {
    internal val mData: MutableList<T> = mutableListOf<T>()

    fun setData(list: List<T>) {
        //todo use Diff to update only necessary entries
        mData.clear()
        mData.addAll(list)
        notifyDataSetChanged()
    }

    override fun getItemCount() = mData.size

    override fun getItemViewType(position: Int) = mData[position].getViewType().viewType

    abstract override fun onBindViewHolder(p0: BaseRotationalHolder<T>, p1: Int)

    fun inflateViewForType(parent: ViewGroup, viewType: Int): View = LayoutInflater.from(parent.context)
        .inflate(
            getLayoutForType(viewType),
            parent,
            false
        )

    private fun getLayoutForType(item: Int): Int {
        return when (item) {
            ListableViewType.ALBUM.viewType -> R.layout.album_item
            ListableViewType.ARTIST.viewType -> R.layout.artist_item//todo create layout for artist
            else -> TODO("ViewType unknown")
        }
    }
}