package com.example.trekdeaths.presenter

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Presenter @Inject constructor() { // Todo connect to the model layer

    fun getEpisodesForSeries(series: Int) : List<String> {
        return listOf("Balance of Mercy")
    }

    fun getCrewForEpisode(series: Int, episodeID: Int) : List<String> {
        return listOf("James McCoy")
    }

    fun getCrewMembers(searchTerm: String) : List<String> {
        return listOf("James McCoy")
    }
}