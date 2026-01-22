package com.gilorroristore.recyclerviewsimpsons.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gilorroristore.recyclerviewsimpsons.databinding.ItemSimpsonBinding
import com.gilorroristore.recyclerviewsimpsons.domain.model.SimpsonModel

class SimpsonsAdapter(
    private var listSimpson: List<SimpsonModel> = emptyList(),
    private val onItemSelected: (SimpsonModel) -> Unit
) : RecyclerView.Adapter<SimpsonsViewHolder>() {

    fun updateList(listSimpson: List<SimpsonModel> ){
        this.listSimpson = listSimpson
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpsonsViewHolder = SimpsonsViewHolder(
        binding = ItemSimpsonBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        onItemSelected = onItemSelected
    )

    override fun onBindViewHolder(holder: SimpsonsViewHolder, position: Int) {
        holder.addItem(listSimpson[position])
    }

    override fun getItemCount() = listSimpson.size
}