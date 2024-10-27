package com.example.recycerview.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recycerview.Item

class MyViewModel : ViewModel() {

    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>> get() = _items

    init {
        // Simulando la carga de datos
        loadItems()
    }

    private fun loadItems() {
        // Aquí podrías cargar datos de una API o base de datos
        val itemList = listOf(
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
        _items.value = itemList
    }
}
