package com.example.recycerview


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycerview.databinding.ItemViewBinding

class MyAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    // Clase interna que representa el ViewHolder usando View Binding
    /*
    * Uso de View Binding en ViewHolder: En lugar de inflar la vista y buscar las referencias a las vistas mediante findViewById(),
    * ahora utilizamos un objeto binding de tipo ItemViewBinding.
    * Esto nos permite acceder a las vistas directamente desde binding (por ejemplo, binding.textViewTitle).
     */
    class ViewHolder(private val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        /*
        * Método bind: Este método se encarga de vincular los datos del objeto Item a las vistas en el layout.
        * Llama a binding.textViewTitle y binding.textViewDescription para establecer el texto, lo que simplifica
        * la asignación de datos.
         */
        fun bind(item: Item) {
            binding.textViewTitle.text = item.title
            binding.textViewDescription.text = item.description
        }
    }

    // Crear la vista para cada item
    /*
    * Inflando el Layout: En lugar de inflar el layout y luego buscar cada vista, se utiliza ItemViewBinding.inflate(),
    * que crea automáticamente una instancia de ItemViewBinding asociada a item_view.xml.
    * Esto asegura que todas las vistas se inicialicen correctamente y estén listas para usarse.
    * Creación del ViewHolder: Luego, se crea y devuelve un nuevo ViewHolder, pasándole el binding como argumento
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    // Vincular los datos a cada elemento de la lista
    /*
    * Vinculación de Datos: Cuando se vinculan los datos a un ViewHolder,
    * se llama al método bind, pasándole el Item correspondiente de la lista itemList.
    * Esto mantiene la lógica de separación de la presentación y la vinculación de datos,
    * lo que es una buena práctica de diseño.
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    // Número total de elementos
    override fun getItemCount() = itemList.size
}

