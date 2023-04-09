package com.example.myapplication3.data

import com.example.myapplication3.data.domin.Match

object DataManager {
    private val matchesList = mutableListOf<Match>()
    private var matchIndex = 0

    fun addMatch(match: Match) {
        matchesList.add(match)
    }

    fun getCurrentMatch() : Match = matchesList[matchIndex]


    fun getNextMatch() : Match {
        matchIndex++
        if(matchIndex == matchesList.size){
            matchIndex = 0
        }
        return matchesList[matchIndex]
    }
    
    fun getPreviousMatch() : Match {
        matchIndex--
        if(matchIndex == -1){
            matchIndex = matchesList.size - 1
        }
        return matchesList[matchIndex]
    }
}