package com.mh.curvenavigation

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mh.curvenavigation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.navigation.initWithSaveInstanceState(savedInstanceState)
        binding.navigation.addSpaceItem(SpaceItem("HOME", R.drawable.sym_def_app_icon))
        binding.navigation.addSpaceItem(SpaceItem("SEARCH", R.drawable.sym_def_app_icon))





    }
}