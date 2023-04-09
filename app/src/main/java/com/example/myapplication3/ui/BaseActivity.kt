package com.example.myapplication3.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding


abstract class BaseActivity<VB: ViewBinding>: AppCompatActivity() {

    abstract val LOG_TAG: String
    abstract val bindingInflater: (LayoutInflater) -> VB
    private var _binding: ViewBinding? = null

    protected val binding
        get() = _binding as VB?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater(layoutInflater)
        setContentView(requireNotNull(_binding).root)

        setUp()
        addCallBacks()

    }

    abstract fun setUp()

    abstract fun addCallBacks()

    protected fun log(value : Any) {
        Log.v(LOG_TAG,value.toString())
    }
}
/*and it's okay to call OnCreate function in any activity this OnCreate function in BaseActivity
will run first then the OnCreate function in that activity when that activity created and that is
not just the onCreate Function!! */