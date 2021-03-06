package com.example.kotolin_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.also {
            it.setTitleTextColor(getColor(R.color.white))
            setSupportActionBar(it)
        }

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.contentFrame, MainFragment.newInstance())
        }.commit()
    }
}