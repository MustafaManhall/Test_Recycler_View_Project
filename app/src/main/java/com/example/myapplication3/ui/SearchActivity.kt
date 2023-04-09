package com.example.myapplication3.ui

import android.view.LayoutInflater
import com.example.myapplication3.databinding.ActivitySearchBinding

class SearchActivity : BaseActivity<ActivitySearchBinding>() {

    override val LOG_TAG: String = "SEARCH_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivitySearchBinding = ActivitySearchBinding::inflate


    override fun setUp() {

    }

    override fun addCallBacks() {

    }

}