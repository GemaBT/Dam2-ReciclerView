package com.example.recycerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val items = listOf(
            Item("Item 1", "Description for item 1"),
            Item("Item 2", "Description for item 2"),
            Item("Item 3", "Description for item 3"),
            Item("Item 4", "Description for item 4"),
            Item("Item 5", "Description for item 5"),
            Item("Item 6", "Description for item 6"),
            Item("Item 7", "Description for item 7"),
            Item("Item 8", "Description for item 8"),
            Item("Item 9", "Description for item 9"),
            Item("Item 10", "Description for item 10"),
            Item("Item 11", "Description for item 11"),
            Item("Item 12", "Description for item 12"),
            Item("Item 13", "Description for item 13"),
            Item("Item 14", "Description for item 14"),
            Item("Item 15", "Description for item 15")


        )
        /*val items = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9",
            "Item 10", "Item 11", "Item 12", "Item13", "Item 14", "Item15", "Item 16", "Item 17")*/

        // Configurar el RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MyAdapter(items)

    }
}
