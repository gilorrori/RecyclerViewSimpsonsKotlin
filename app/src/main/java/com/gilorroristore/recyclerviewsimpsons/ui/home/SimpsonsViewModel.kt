package com.gilorroristore.recyclerviewsimpsons.ui.home

import androidx.lifecycle.ViewModel
import com.gilorroristore.recyclerviewsimpsons.data.Provider
import com.gilorroristore.recyclerviewsimpsons.domain.model.SimpsonModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class SimpsonsViewModel @Inject constructor(provider: Provider) : ViewModel() {
    private var _simpson : MutableStateFlow<List<SimpsonModel>> = MutableStateFlow(emptyList())
    val simpson : StateFlow<List<SimpsonModel>> = _simpson


    init {
        _simpson.value = provider.getCharacters()
    }

}