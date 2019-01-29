package com.demos.henrique.lastfmpeek.dto

import org.junit.Assert.assertEquals
import org.junit.Test

class AlbumItemTest {

    private lateinit var item: AlbumItem
    private val validImageItem = ImageItem("http://www.dummyurl.dummy")
    private val invalidImageItem = ImageItem()
    private val validArtistName = "Metallica"
    private val invalidArtistName: String? = null
    private val validAlbumName = "Master of Puppets"
    private val invalidAlbumName: String? = null
    private val validCoverList = listOf<ImageItem?>(validImageItem)
    private val invalidCoverList = listOf<ImageItem?>(invalidImageItem)

    @Test
    fun isValid_givenAllValidDependencies_thenShouldPass() {
        item = AlbumItem(validCoverList, null, validArtistName, null, validAlbumName, null)
        val result = item.isValid()
        val expectedResult = true

        assertEquals(expectedResult, result)
    }

    @Test
    fun isValid_givenInvalidCoverList_thenShouldFail() {
        item = AlbumItem(invalidCoverList, null, validArtistName, null, validAlbumName, null)
        val result = item.isValid()
        val expectedResult = false

        assertEquals(expectedResult, result)
    }

    @Test
    fun isValid_givenInvalidArtistName_thenShouldFail() {
        item = AlbumItem(validCoverList, null, invalidArtistName, null, validAlbumName, null)
        val result = item.isValid()
        val expectedResult = false

        assertEquals(expectedResult, result)
    }

    @Test
    fun isValid_givenInvalidAlbumName_thenShouldFail() {
        item = AlbumItem(validCoverList, null, validArtistName, null, invalidAlbumName, null)
        val result = item.isValid()
        val expectedResult = false

        assertEquals(expectedResult, result)
    }
}