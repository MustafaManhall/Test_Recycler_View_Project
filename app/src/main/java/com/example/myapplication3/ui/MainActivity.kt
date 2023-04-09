package com.example.myapplication3.ui

import android.view.LayoutInflater
import com.example.myapplication3.data.DataManager
import com.example.myapplication3.databinding.ActivityMainBinding
import com.example.myapplication3.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val LOG_TAG: String = "MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun setUp() {
        parseFile()
    }

    override fun addCallBacks() {
        binding?.apply {

        }
    }

    private fun parseFile() {
        val inputStream = assets.open("worldCup.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = CsvParser()
        buffer.forEachLine {
           val currentMatch = parser.parse(it)
           DataManager.addMatch(currentMatch)
            log(currentMatch)
        }
    }
}