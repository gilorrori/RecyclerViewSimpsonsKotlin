package com.gilorroristore.recyclerviewsimpsons.ui.home.adapter

import androidx.recyclerview.widget.RecyclerView
import com.gilorroristore.recyclerviewsimpsons.databinding.ItemSimpsonBinding
import com.gilorroristore.recyclerviewsimpsons.domain.model.SimpsonModel

class SimpsonsViewHolder (
    private val binding: ItemSimpsonBinding,
    private val onItemSelected: (SimpsonModel) -> Unit
): RecyclerView.ViewHolder(binding.root) {

    fun addItem(simpson: SimpsonModel){
        binding.ivCharacter.setImageResource(simpson.image)
        binding.tvCharacterDescription.text = binding.root.context.getString(simpson.description)
        binding.tvCharacterName.text = binding.root.context.getString(simpson.name)

        binding.root.setOnClickListener {
            onItemSelected(simpson)
        }
    }
}