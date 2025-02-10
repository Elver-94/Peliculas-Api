package com.example.mejorespelis

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mejorespelis.Model.Serie

class peliculasAdapter(val series: List<Serie>): RecyclerView.Adapter<PeliculaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder {
        val layoutInflater : LayoutInflater = LayoutInflater.from(parent.context)
        return PeliculaViewHolder(layoutInflater.inflate(R.layout.itemserie, parent, false))
    }

    override fun getItemCount(): Int {
        return series.size
    }

    override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) {
        val item: Serie = series [position]
        holder.bind(item)
    }
}