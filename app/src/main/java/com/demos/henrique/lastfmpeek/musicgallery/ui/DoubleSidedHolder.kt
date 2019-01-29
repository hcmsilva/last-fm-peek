package com.demos.henrique.lastfmpeek.musicgallery.ui

import android.animation.Animator
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.View
import com.demos.henrique.lastfmpeek.R
import com.demos.henrique.lastfmpeek.model.Album
import com.demos.henrique.lastfmpeek.sharedui.BaseRotationalHolder
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.album_item.view.*
import kotlin.math.abs

class DoubleSidedHolder(val holderView: View) : BaseRotationalHolder<Album>(holderView) {

    val coverImageView = holderView.album_cover_iv
    val artistTextView = holderView.artist_name_tv
    val albumNameTextView = holderView.album_name_tv
    val albumBackView = holderView.album_back_layout
    val artistNameBackTvColumns = holderView.band_name_back_tv
    val albumNameBack = holderView.album_name_back_tv
    val playAlbumBtn = holderView.check_album_btn

    override fun bindHolder(item: Album) {
        flipAlbum(holderView, resetState = true)

        displayCover(item)
        artistTextView.text = item.artist
        albumNameTextView.text = item.albumName
        artistNameBackTvColumns.text = item.artist
        albumNameBack.text = item.albumName

        if (item.albumDetailsUrl.isNullOrBlank()) {
            playAlbumBtn.setOnClickListener(null)
            playAlbumBtn.visibility = View.INVISIBLE
        } else {
            playAlbumBtn.setOnClickListener { v -> checkAlbumWebsite(v.context, item.albumDetailsUrl) }
            playAlbumBtn.visibility = View.VISIBLE
        }

        holderView.setOnClickListener { _ -> flipAlbum(holderView) }
    }

    private fun checkAlbumWebsite(ctx: Context, albumDetailsUrl: String) =
        ctx.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(albumDetailsUrl)))

    private fun displayCover(item: Album) =
        if (!item.albumCoverUrl.isNullOrBlank())
            Picasso.get().load(item.albumCoverUrl).placeholder(R.drawable.ic_vinyl_3_black).into(coverImageView)
        else
            Picasso.get().load(R.drawable.ic_vinyl_3_black).placeholder(R.drawable.ic_vinyl_3_black).into(coverImageView)

    private fun flipAlbum(holderView: View, resetState: Boolean = false) {
        if (resetState) {
            resetRot(holderView)
            return
        }
        if (holderView.rotationY == 0f)
            spinView(holderView, 180f)
        else
            spinView(holderView, 0f)
    }

    private fun resetRot(albumLayout: View) {
        holderView.rotationY = 0f
        albumBackView.rotationY = 180f
        albumLayout.album_front_layout.visibility = View.VISIBLE
        albumLayout.album_back_layout.visibility = View.INVISIBLE
    }

    private fun spinView(itemView: View, degrees: Float) {

        val delta = degrees - itemView.rotationY
        val midPoint = abs(delta / 2)

        itemView.animate().rotationY(midPoint).setListener(object : CustomRotatorListener() {
            override fun onAnimationEnd(animation: Animator?) {
                if (delta > 0) {
                    itemView.album_front_layout.visibility = View.INVISIBLE
                    itemView.album_back_layout.visibility = View.VISIBLE
                } else {
                    itemView.album_front_layout.visibility = View.VISIBLE
                    itemView.album_back_layout.visibility = View.INVISIBLE
                }
                itemView.animate().rotationY(degrees)
            }
        })
    }

    private abstract class CustomRotatorListener : Animator.AnimatorListener {
        override fun onAnimationRepeat(animation: Animator?) {}
        override fun onAnimationCancel(animation: Animator?) {}
        override fun onAnimationStart(animation: Animator?) {}
    }
}