package com.demos.henrique.lastfmpeek.model

import com.demos.henrique.lastfmpeek.dto.AlbumItem
import com.demos.henrique.lastfmpeek.dto.ImageItem
import com.demos.henrique.lastfmpeek.sharedui.ListableViewType
import org.junit.Assert.*
import org.junit.Test

class AlbumTest {

    private lateinit var album: Album
    private val validArtistName = "Metallica"
    private val invalidArtistName: String? = null
    private val validAlbumName = "Master of Puppets"
    private val invalidAlbumName: String? = null
    private val dummyImageUrl = "dummyurl"
    private val nullImageUrl = null
    private val validAlbumDto = AlbumItem(listOf(), artist = validArtistName, name = validAlbumName)
    private val validAlbumDtoWithoutCover = AlbumItem(listOf(), artist = validArtistName, name = validAlbumName)
    private val validAlbumDtoWithCover = AlbumItem(listOf(ImageItem(dummyImageUrl)), artist = validArtistName, name = validAlbumName)
    private val noNameAlbumDto = AlbumItem(listOf(), artist = validArtistName, name = invalidAlbumName)
    private val noArtistAlbumDto = AlbumItem(listOf(), artist = invalidArtistName, name = validAlbumName)

    @Test
    fun getViewType_givenValidDependencies_shouldReturnAlbumView() {

        album = Album(validAlbumDtoWithCover)

        val expectedViewType = ListableViewType.ALBUM
        val actualResult = album.getViewType()

        assertEquals(expectedViewType, actualResult)
    }

    @Test
    fun getViewType_givenInvalidDependencies_shouldReturnAlbumView() {

        album = Album(validAlbumDtoWithoutCover)

        val expectedViewType = ListableViewType.ALBUM
        val actualResult = album.getViewType()

        assertEquals(expectedViewType, actualResult)
    }

    @Test
    fun getAlbumCoverUrl_givenCompleteDto_shouldHaveImage() {

        album = Album(validAlbumDtoWithCover)

        val expectedResult = dummyImageUrl
        val actualResult = album.albumCoverUrl

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun getAlbumCoverUrl_givenPartialDto_shouldntHaveImage() {

        album = Album(validAlbumDtoWithoutCover)

        val expectedResult = ""
        val actualResult = album.albumCoverUrl

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun isValid_givenCompleteDto_shouldPass() {

        album = Album(validAlbumDto)

        assertTrue(album.isValid())
    }


    @Test
    fun isValid_givenPartialValidDto_shouldPass() {

        album = Album(validAlbumDtoWithoutCover)

        assertTrue(album.isValid())
    }

    @Test
    fun isValid_givenAlbumWithoutName_shouldFail() {

        album = Album(noNameAlbumDto)

        assertFalse(album.isValid())
    }

    @Test
    fun isValid_givenAlbumWithoutArtist_shouldFail() {

        album = Album(noArtistAlbumDto)

        assertFalse(album.isValid())
    }
}