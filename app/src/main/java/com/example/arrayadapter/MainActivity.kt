package com.example.arrayadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.arrayadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val books = arrayOf(
            "The Alchemist",
            "Like the flowing river",
            "Manuscript found in Accra",
            "The winner stands alone",
            "The Zahir",
            "The warrior of light",
            "Brida",
            "The pilgrimage",
            "Veronica decides to die",
            "Eleven minutes",
            "Maktub",
            "By the river Piedra I sat down and wept",
            "The fifth mountain",
            "Things fall apart",
            "No longer at ease",
            "A man of the people",
            "Anthills of the savannah",
            "Encounters from Africa",
            "Scarlet song",
            "No sweetness here",
            "The Richest man in Babylon",
            "Romeo and Juliet"
        )

        val arrayAdapter =
            ArrayAdapter(applicationContext, R.layout.item_view, R.id.itemTextView, books)
        binding.simpleListView.adapter = arrayAdapter
    }
}