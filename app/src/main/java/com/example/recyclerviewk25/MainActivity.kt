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
            R.color.white,
            R.color.light_gray,
            R.color.pink,
            R.color.gold,
            R.color.yellow,
            R.color.orange,
            R.color.cyan,
            R.color.green,
            R.color.teal,
            R.color.purple,
            R.color.blue,
            R.color.magenta,
            R.color.red,
            R.color.indigo,
            R.color.brown,
            R.color.black,
            R.color.gray,
            R.color.dark_gray
        )

        val colorsList = colorIds.map { ContextCompat.getColor(this, it) }
        val rv = findViewById<RecyclerView>(R.id.rview)
        val colorAdapter = ColorAdapter(LayoutInflater.from(this))
        colorAdapter.submitList(colorsList)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = colorAdapter
    }
}
