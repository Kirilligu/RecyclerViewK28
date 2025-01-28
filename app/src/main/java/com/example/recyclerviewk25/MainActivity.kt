package com.example.recyclerviewk25

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorIds = listOf(
            R.color.blue_1,
            R.color.blue_2,
            R.color.blue_3,
            R.color.blue_4,
            R.color.blue_5,
            R.color.blue_6,
            R.color.blue_7,
            R.color.blue_8,
            R.color.blue_9,
            R.color.blue_10,
            R.color.blue_11,
            R.color.blue_12,
            R.color.blue_13,
            R.color.blue_14,
            R.color.blue_15,
            R.color.blue_16,
            R.color.blue_17,
            R.color.blue_18,
            R.color.blue_19,
            R.color.blue_20
        )

        val colorsList = colorIds.map { ContextCompat.getColor(this, it) }
        val rv = findViewById<RecyclerView>(R.id.rview)
        val colorAdapter = ColorAdapter(LayoutInflater.from(this))
        colorAdapter.submitList(colorsList)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = colorAdapter
    }
}
