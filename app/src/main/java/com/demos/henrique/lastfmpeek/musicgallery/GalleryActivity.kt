package com.demos.henrique.lastfmpeek.musicgallery

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.SearchView
import android.support.v7.widget.SearchView.OnQueryTextListener
import android.view.Menu
import android.view.View
import com.demos.henrique.lastfmpeek.R
import com.demos.henrique.lastfmpeek.di.components.DaggerGalleryActivityComponent
import com.demos.henrique.lastfmpeek.di.components.GalleryActivityComponent
import com.demos.henrique.lastfmpeek.di.modules.ApiModule
import com.demos.henrique.lastfmpeek.di.modules.GalleryPresenterModule
import com.demos.henrique.lastfmpeek.model.Album
import com.demos.henrique.lastfmpeek.musicgallery.ui.AlbumAdapter
import kotlinx.android.synthetic.main.activity_gallery.*
import javax.inject.Inject

class GalleryActivity : AppCompatActivity(), MusicGalleryContract.GalleryView {

    @Inject lateinit var mPresenter: GalleryPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        setupDependencies()
        setupViews()

        //mPresenter.getArtistData("Lana Del Rey")
    }

    private fun setupViews() {
        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recycler_view.adapter = AlbumAdapter()
    }

    private fun setupDependencies() {
        val galleryActivityComponent: GalleryActivityComponent =
            DaggerGalleryActivityComponent.builder()
            .galleryPresenterModule(GalleryPresenterModule(this))
            .apiModule(ApiModule(getString(R.string.last_fm_base_endpoint), getString(R.string.api_secret)))
            .build()

        galleryActivityComponent.inject(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        val searchItem = menu?.findItem(R.id.action_search)
        val searchView = searchItem?.actionView as SearchView
        searchView.animate()
        searchView.queryHint = getString(R.string.search_str)

        searchView.setOnQueryTextListener(object : OnQueryTextListener {
            override fun onQueryTextSubmit(queryText: String?): Boolean {
                if (!queryText.isNullOrBlank())
                    mPresenter.getArtistData(queryText!!)
                return false
            }
            override fun onQueryTextChange(p0: String?) = false
        })
        return true
    }

    override fun showLoading(isLoading: Boolean) = when (isLoading) {
        true -> {
            empty_layout.visibility = View.INVISIBLE
            results_layout.visibility = View.INVISIBLE
            search_loading_layout.visibility = View.VISIBLE
        }
        false -> {
            empty_layout.visibility = View.INVISIBLE
            search_loading_layout.visibility = View.INVISIBLE
            results_layout.visibility = View.VISIBLE
        }
    }

    override fun displayAlbums(albumList: List<Album>) {
        (recycler_view.adapter as AlbumAdapter).setData(albumList)
        if(albumList.isNotEmpty())
            recycler_view.scrollToPosition(0)
    }
}
