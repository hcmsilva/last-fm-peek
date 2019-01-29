package com.demos.henrique.lastfmpeek.di.modules

import com.demos.henrique.lastfmpeek.musicgallery.GalleryPresenter
import com.demos.henrique.lastfmpeek.musicgallery.MusicGalleryContract.GalleryView
import com.demos.henrique.lastfmpeek.network.DataContract
import dagger.Module
import dagger.Provides

@Module(includes = [ApiModule::class])
class GalleryPresenterModule(val view: GalleryView) {

    @Provides
    fun provideGalleryPresenter(apiClient: DataContract) = GalleryPresenter(view, apiClient)
}