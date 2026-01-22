package com.gilorroristore.recyclerviewsimpsons.ui.home

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.gilorroristore.recyclerviewsimpsons.databinding.ActivityMainBinding
import com.gilorroristore.recyclerviewsimpsons.domain.model.SimpsonModel
import com.gilorroristore.recyclerviewsimpsons.ui.home.adapter.SimpsonsAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val simpsonsViewModel by viewModels<SimpsonsViewModel>()
    private lateinit var simpsonsAdapter: SimpsonsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {

        simpsonsAdapter = SimpsonsAdapter() {
            initDetailSimpson(it)
        }
        binding.rvSimpsons.adapter = simpsonsAdapter

        getCharacters()
    }

    private fun getCharacters() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                simpsonsViewModel.simpson.collect { listSimpson ->
                    simpsonsAdapter.updateList(listSimpson)
                }
            }
        }
    }

    fun initDetailSimpson(simpsonModel: SimpsonModel) {
        Toast.makeText(this, "Character: ${getString(simpsonModel.name)}", Toast.LENGTH_SHORT).show()
    }
}