package com.example.mejorespelis

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.mejorespelis.databinding.ItemserieBinding
import com.example.mejorespelis.Model.Serie

class PeliculaViewHolder(view:View) :RecyclerView.ViewHolder(view) {

    private val binding = ItemserieBinding.bind(view)

    fun bind(serie: Serie) {
        binding.tvTitle.text = "Nombre: " + serie.name

    }
}