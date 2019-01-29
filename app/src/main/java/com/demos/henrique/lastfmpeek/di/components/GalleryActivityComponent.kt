package com.demos.henrique.lastfmpeek.di.components

import com.demos.henrique.lastfmpeek.di.modules.ApiModule
import com.demos.henrique.lastfmpeek.di.modules.GalleryPresenterModule
import com.demos.henrique.lastfmpeek.musicgallery.GalleryActivity
import dagger.Component


@Component(dependencies = [], modules = [GalleryPresenterModule::class, ApiModule::class])
interface GalleryActivityComponent {
    fun inject(view: GalleryActivity)
}