package eu.kanade.tachiyomi.data.track

import eu.kanade.tachiyomi.data.database.models.Track

interface UserListTracker : Tracker {
    suspend fun fetchUserMangaList(): List<Track>
}
