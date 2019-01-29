package com.demos.henrique.lastfmpeek.network


val responseBodyString = """{
"results": {
"opensearch:Query": {
"#text": "",
"role": "request",
"searchTerms": "beatles",
"startPage": "1"
},
"opensearch:totalResults": "395606",
"opensearch:startIndex": "0",
"opensearch:itemsPerPage": "50",
"albummatches": {
"album": [{
"name": "Abbey Road",
"artist": "The Beatles",
"url": "https://www.last.fm/music/The+Beatles/Abbey+Road",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/2ce29f74a6f54b8791e5fdacc2ba36f5.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/2ce29f74a6f54b8791e5fdacc2ba36f5.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/2ce29f74a6f54b8791e5fdacc2ba36f5.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/2ce29f74a6f54b8791e5fdacc2ba36f5.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "e12f53a3-e912-321d-bdc7-ed17ec525ec0"
},
{
"name": "The Beatles (The White Album)",
"artist": "The Beatles",
"url": "https://www.last.fm/music/The+Beatles/The+Beatles+(The+White+Album)",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/59e40d830d1c4206b6d392a09d94f2b4.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/59e40d830d1c4206b6d392a09d94f2b4.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/59e40d830d1c4206b6d392a09d94f2b4.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/59e40d830d1c4206b6d392a09d94f2b4.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": ""
},
{
"name": "Sgt. Pepper's Lonely Hearts Club Band",
"artist": "The Beatles",
"url": "https://www.last.fm/music/The+Beatles/Sgt.+Pepper%27s+Lonely+Hearts+Club+Band",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/5a63743f4ba244678b74d90ad868504f.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/5a63743f4ba244678b74d90ad868504f.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/5a63743f4ba244678b74d90ad868504f.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/5a63743f4ba244678b74d90ad868504f.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "44b7cab1-0ce1-404e-9089-b458eb3fa530"
}
]
},
"@attr": {
"for": "beatles"
}
}
}"""

val responseBodyStringLong = """{
"results": {
"opensearch:Query": {
"#text": "",
"role": "request",
"searchTerms": "beatles",
"startPage": "1"
},
"opensearch:totalResults": "395606",
"opensearch:startIndex": "0",
"opensearch:itemsPerPage": "50",
"albummatches": {
"album": [{
"name": "Abbey Road",
"artist": "The Beatles",
"url": "https://www.last.fm/music/The+Beatles/Abbey+Road",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/2ce29f74a6f54b8791e5fdacc2ba36f5.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/2ce29f74a6f54b8791e5fdacc2ba36f5.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/2ce29f74a6f54b8791e5fdacc2ba36f5.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/2ce29f74a6f54b8791e5fdacc2ba36f5.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "e12f53a3-e912-321d-bdc7-ed17ec525ec0"
},
{
"name": "The Beatles (The White Album)",
"artist": "The Beatles",
"url": "https://www.last.fm/music/The+Beatles/The+Beatles+(The+White+Album)",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/59e40d830d1c4206b6d392a09d94f2b4.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/59e40d830d1c4206b6d392a09d94f2b4.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/59e40d830d1c4206b6d392a09d94f2b4.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/59e40d830d1c4206b6d392a09d94f2b4.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": ""
},
{
"name": "Sgt. Pepper's Lonely Hearts Club Band",
"artist": "The Beatles",
"url": "https://www.last.fm/music/The+Beatles/Sgt.+Pepper%27s+Lonely+Hearts+Club+Band",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/5a63743f4ba244678b74d90ad868504f.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/5a63743f4ba244678b74d90ad868504f.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/5a63743f4ba244678b74d90ad868504f.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/5a63743f4ba244678b74d90ad868504f.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "44b7cab1-0ce1-404e-9089-b458eb3fa530"
},
{
"name": "Master of Puppets",
"artist": "Metallica",
"url": "https://www.last.fm/music/Metallica/Master+of+Puppets",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/07f492a00c904cc6ccf868010be4d5a6.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/07f492a00c904cc6ccf868010be4d5a6.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/07f492a00c904cc6ccf868010be4d5a6.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/07f492a00c904cc6ccf868010be4d5a6.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "b30c90dd-83f1-4897-ae36-58fb3935e5ee"
},
{
"name": "Death Magnetic",
"artist": "Metallica",
"url": "https://www.last.fm/music/Metallica/Death+Magnetic",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/bb80178de028c2e7b1897ff87cbdd58e.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/bb80178de028c2e7b1897ff87cbdd58e.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/bb80178de028c2e7b1897ff87cbdd58e.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/bb80178de028c2e7b1897ff87cbdd58e.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "a826c9d4-f35e-436d-b218-818fc9beb841"
},
{
"name": "Ride the Lightning",
"artist": "Metallica",
"url": "https://www.last.fm/music/Metallica/Ride+the+Lightning",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/facc25ab07d2fda56d48ef4229caa959.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/facc25ab07d2fda56d48ef4229caa959.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/facc25ab07d2fda56d48ef4229caa959.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/facc25ab07d2fda56d48ef4229caa959.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "2236dd07-a2f3-466a-973d-9069001a89da"
},
{
"name": "...and Justice for All",
"artist": "Metallica",
"url": "https://www.last.fm/music/Metallica/...and+Justice+for+All",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/55bf2f31f75ac374ccdda18d6204824a.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/55bf2f31f75ac374ccdda18d6204824a.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/55bf2f31f75ac374ccdda18d6204824a.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/55bf2f31f75ac374ccdda18d6204824a.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "4dede30f-58cf-4d43-a857-b342ad7be945"
},
{
"name": "Reload",
"artist": "Metallica",
"url": "https://www.last.fm/music/Metallica/Reload",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/2337cd15387549e5a94c04b6ad92b68c.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/2337cd15387549e5a94c04b6ad92b68c.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/2337cd15387549e5a94c04b6ad92b68c.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/2337cd15387549e5a94c04b6ad92b68c.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "1a5c2e08-0a96-36b5-ad96-0243aa716f8e"
},
{
"name": "Kill 'Em All",
"artist": "Metallica",
"url": "https://www.last.fm/music/Metallica/Kill+%27Em+All",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/0e79f0c8fbf341178601367a4a12a890.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/0e79f0c8fbf341178601367a4a12a890.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/0e79f0c8fbf341178601367a4a12a890.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/0e79f0c8fbf341178601367a4a12a890.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "c06ed440-f25d-3127-aadb-ebe9c685b3d8"
},
{
"name": "Load",
"artist": "Metallica",
"url": "https://www.last.fm/music/Metallica/Load",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/c32d240ba59d4491ba5ce25939cba1ab.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/c32d240ba59d4491ba5ce25939cba1ab.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/c32d240ba59d4491ba5ce25939cba1ab.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/c32d240ba59d4491ba5ce25939cba1ab.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "d08247fc-25b6-3570-a794-bed0735a8f86"
},
{
"name": "Plays Metallica By Four Cellos",
"artist": "Apocalyptica",
"url": "https://www.last.fm/music/Apocalyptica/Plays+Metallica+By+Four+Cellos",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/a6075751011c4bab922f49a989f4c0a0.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/a6075751011c4bab922f49a989f4c0a0.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/a6075751011c4bab922f49a989f4c0a0.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/a6075751011c4bab922f49a989f4c0a0.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "58186008-1efd-4c79-8658-65e58ef1be4c"
},
{
"name": "Garage Inc.",
"artist": "Metallica",
"url": "https://www.last.fm/music/Metallica/Garage+Inc.",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/10a33bff80955b5125c1b3afda7c5860.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/10a33bff80955b5125c1b3afda7c5860.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/10a33bff80955b5125c1b3afda7c5860.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/10a33bff80955b5125c1b3afda7c5860.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": ""
},
{
"name": "Metallica Through The Never (Music From The Motion Picture)",
"artist": "Metallica",
"url": "https://www.last.fm/music/Metallica/Metallica+Through+The+Never+(Music+From+The+Motion+Picture)",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/21fe4f4ad51541dc83ae1a3d0e620b7d.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/21fe4f4ad51541dc83ae1a3d0e620b7d.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/21fe4f4ad51541dc83ae1a3d0e620b7d.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/21fe4f4ad51541dc83ae1a3d0e620b7d.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": ""
},
{
"name": "St. Anger",
"artist": "Metallica",
"url": "https://www.last.fm/music/Metallica/St.+Anger",
"image": [
{
"#text": "https://lastfm-img2.akamaized.net/i/u/34s/390bfe06a1c24cf9adb061688bee8262.png",
"size": "small"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/64s/390bfe06a1c24cf9adb061688bee8262.png",
"size": "medium"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/174s/390bfe06a1c24cf9adb061688bee8262.png",
"size": "large"
},
{
"#text": "https://lastfm-img2.akamaized.net/i/u/300x300/390bfe06a1c24cf9adb061688bee8262.png",
"size": "extralarge"
}
],
"streamable": "0",
"mbid": "5e084362-0d76-4c3f-9a42-8ec3b4406b32"
}
]
},
"@attr": {
"for": "beatles"
}
}
}"""