package com.example.recycerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycerview.databinding.ActivityMainBinding
import com.example.recycerview.ui.MyViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MyViewModel by viewModels() // Usar viewModels para obtener la instancia de MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        // Observar los cambios en la lista de items
        viewModel.items.observe(this) { items ->
            binding.recyclerView.adapter = MyAdapter(items) // Actualiza el adapter cuando los datos cambien
        }
    }
}

