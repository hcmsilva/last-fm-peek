package com.demos.henrique.lastfmpeek.musicgallery

import com.demos.henrique.lastfmpeek.dto.AlbumItem
import com.demos.henrique.lastfmpeek.dto.ImageItem
import com.demos.henrique.lastfmpeek.dto.Results
import com.demos.henrique.lastfmpeek.model.Album
import com.demos.henrique.lastfmpeek.musicgallery.MusicGalleryContract.GalleryView
import com.demos.henrique.lastfmpeek.network.DataContract
import com.demos.henrique.lastfmpeek.network.DataReceiver
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.BDDMockito.then
import org.mockito.Mockito
import org.mockito.Mockito.mock

class GalleryPresenterTest {

    private lateinit var mockView: GalleryView
    private lateinit var mockApiClient: DataContract
    private lateinit var mPresenter: GalleryPresenter
    private lateinit var mockDataReceiver: DataReceiver<Results>
    private inline fun <reified T : Any> customGenericMock() = Mockito.mock(T::class.java)!!

    private val validArtist = "Metallica"
    private val validAlbumName = "Master of Puppets"
    private val invalidArtist1: String? = null
    private val invalidArtist2 = ""
    private val invalidAlbumName1: String? = null
    private val invalidAlbumName2 = ""
    private val dummyUrl = "dummyUrl"

    @Before
    fun setup() {
        mockView = mock(GalleryView::class.java)
        mockApiClient = mock(DataContract::class.java)
        mockDataReceiver = customGenericMock()
    }

    @Test
    fun getArtistData_givenCall_shouldInvokeViewLoading() {

        val loadingSwitch = true
        mPresenter = GalleryPresenter(mockView, mockApiClient)

        mPresenter.getArtistData(ArgumentMatchers.anyString())

        then(mockView)
            .should(Mockito.atLeastOnce())
            .showLoading(loadingSwitch)
    }

    @Test
    fun getArtistData_givenCall_shouldInvokeApi() {

        mPresenter = GalleryPresenter(mockView, mockApiClient)

        mPresenter.getArtistData(validArtist)

        then(mockApiClient)
            .should(Mockito.times(1))
            .getSearchFeed(mPresenter, validArtist)
    }

    @Test
    fun getAlbumListFromData_givenListWithNullElement_shouldRemoveElement() {

        val list =
            listOf(
                AlbumItem(artist = validArtist, name = validAlbumName, imageList = listOf(ImageItem(dummyUrl))),
                null,
                AlbumItem(artist = validArtist, name = validAlbumName, imageList = listOf(ImageItem(dummyUrl))),
                AlbumItem(artist = validArtist, name = validAlbumName, imageList = listOf(ImageItem(dummyUrl))),
                AlbumItem(artist = validArtist, name = validAlbumName, imageList = listOf(ImageItem(dummyUrl)))
            )


        mPresenter = GalleryPresenter(mockView, mockApiClient)

        var resultList: List<Album>? =
            mPresenter.getAlbumListFromData(list)

        assert(resultList?.size == 4)
    }


    @Test
    fun getAlbumListFromData_givenListWithInvalidAlbums_shouldRemoveElements() {

        val faultyAlbumList =
            listOf(
                AlbumItem(artist = validArtist, name = validAlbumName, imageList = listOf(ImageItem(dummyUrl))),
                AlbumItem(artist = validArtist, name = validAlbumName, imageList = listOf(ImageItem())),
                AlbumItem(artist = validArtist, name = validAlbumName, imageList = null),
                AlbumItem(artist = invalidArtist1, name = validAlbumName, imageList = listOf(ImageItem(dummyUrl))),
                AlbumItem(artist = validArtist, name = invalidAlbumName1, imageList = listOf(ImageItem(dummyUrl))),
                AlbumItem(artist = invalidArtist2, name = validAlbumName, imageList = listOf(ImageItem(dummyUrl))),
                AlbumItem(artist = validArtist, name = invalidAlbumName2, imageList = listOf(ImageItem(dummyUrl)))
            )


        mPresenter = GalleryPresenter(mockView, mockApiClient)

        var resultList: List<Album>? =
            mPresenter.getAlbumListFromData(faultyAlbumList)

        assert(resultList?.size == 1)
    }

    @Test
    fun getAlbumListFromData_givenListWithInvalidAlbums_shouldReturnListWithValidAlbums() {

        mPresenter = GalleryPresenter(mockView, mockApiClient)
        val validAlbum1 =
            AlbumItem(artist = validArtist, name = validAlbumName, imageList = listOf(ImageItem(dummyUrl)))
        val validAlbum2 =
            AlbumItem(artist = validArtist, name = validAlbumName, imageList = listOf(ImageItem(dummyUrl)))

        val faultyAlbumList =
            listOf(
                validAlbum1,
                validAlbum2,
                AlbumItem(artist = validArtist, name = validAlbumName, imageList = listOf(ImageItem())),
                AlbumItem(artist = validArtist, name = validAlbumName, imageList = null),
                AlbumItem(artist = invalidArtist1, name = validAlbumName, imageList = listOf(ImageItem(dummyUrl))),
                AlbumItem(artist = validArtist, name = invalidAlbumName1, imageList = listOf(ImageItem(dummyUrl))),
                AlbumItem(artist = invalidArtist2, name = validAlbumName, imageList = listOf(ImageItem(dummyUrl))),
                AlbumItem(artist = validArtist, name = invalidAlbumName2, imageList = listOf(ImageItem(dummyUrl)))
            )

        val expectedList =
            listOf(validAlbum1, validAlbum2)


        var resultList: List<Album>? =
            mPresenter.getAlbumListFromData(faultyAlbumList)


        assert(resultList?.size == expectedList.size)
        if (resultList != null) {
            for (idx in resultList.indices) {
                assertTrue(expectedList[idx].artist == resultList[idx].artist)
                assertTrue(expectedList[idx].name == resultList[idx].albumName)
            }
            return
        }
        fail()
    }

    @Test
    fun receiveDataCallback() {
    }
}