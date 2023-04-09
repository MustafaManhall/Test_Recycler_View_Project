package com.example.myapplication3.util

import com.example.myapplication3.data.domin.Match

class CsvParser {
    fun parse(line: String): Match {
        val tokens = line.split(",")
        return Match(
            year = tokens[Constants.ColumnIndex.YEAR].toInt(),
            stadium = tokens[Constants.ColumnIndex.STADIUM],
            city = tokens[Constants.ColumnIndex.CITY],
            homeTeamName = tokens[Constants.ColumnIndex.HOME_TEAM_NAME],
            awayTeamName = tokens[Constants.ColumnIndex.AWAY_TEAM_NAME],
            homeTeamGoals = tokens[Constants.ColumnIndex.HOME_TEAM_GOALS].toInt(),
            awayTeamGoals = tokens[Constants.ColumnIndex.AWAY_TEAM_GOALS].toInt(),
            refereeName = tokens[Constants.ColumnIndex.REFEREE_NAME]
        )
    }

}