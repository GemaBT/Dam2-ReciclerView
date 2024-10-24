package com.example.recycerview


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    // Clase interna que representa el ViewHolder
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.textViewTitle)
        val textViewD: TextView = itemView.findViewById(R.id.textViewDescription)
    }

    // Crear la vista para cada item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(view)
    }

    // Vincular los datos a cada elemento de la lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = itemList[position].title
        holder.textViewD.text = itemList[position].description
    }

    // Número total de elementos
    override fun getItemCount() = itemList.size
}



