package com.demos.henrique.lastfmpeek.network

import org.junit.Assert.assertEquals
import org.junit.Test

class CustomResponseConverterCompanionTest {

    val jsonResponse = responseBodyString//valid kotlin string literal
    val expectedArtist = "The Beatles"
    val expectedAlbumName0 = "Abbey Road"
    val expectedAlbumName1 = "The Beatles (The White Album)"
    val expectedAlbumName2 = "Sgt. Pepper's Lonely Hearts Club Band"


    @Test
    fun getArtistResultFromDto()
    {
        val albumResponse = CustomResponseConverter.getResultFromDto(jsonResponse)

        assertEquals( expectedArtist, albumResponse!!.albummatches!!.albumList!![0]!!.artist)
        assertEquals( expectedArtist, albumResponse.albummatches!!.albumList!![1]!!.artist)
        assertEquals( expectedArtist, albumResponse.albummatches!!.albumList!![2]!!.artist)
    }

    @Test
    fun getAlbumResultFromDto()
    {
        val albumResponse = CustomResponseConverter.getResultFromDto(jsonResponse)

        assertEquals( expectedAlbumName0, albumResponse!!.albummatches!!.albumList!![0]!!.name)
        assertEquals( expectedAlbumName1, albumResponse.albummatches!!.albumList!![1]!!.name)
        assertEquals( expectedAlbumName2, albumResponse.albummatches!!.albumList!![2]!!.name)
    }
}

