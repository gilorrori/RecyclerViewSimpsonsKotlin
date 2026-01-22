package com.gilorroristore.recyclerviewsimpsons.data

import com.gilorroristore.recyclerviewsimpsons.R
import com.gilorroristore.recyclerviewsimpsons.domain.model.SimpsonModel
import javax.inject.Inject

class Provider @Inject constructor() {
    fun getCharacters() : List<SimpsonModel>{
        return listOf(
            SimpsonModel(R.drawable.bart, R.string.bart_desc, R.string.bart),
            SimpsonModel(R.drawable.krusti, R.string.krusty_desc, R.string.krusty),
            SimpsonModel(R.drawable.homero, R.string.homero_desc, R.string.homero),
            SimpsonModel(R.drawable.marge, R.string.marge_desc, R.string.marge),
            SimpsonModel(R.drawable.lisa, R.string.lisa_desc, R.string.lisa),
            SimpsonModel(R.drawable.magie, R.string.maggie_desc, R.string.maggie),
            SimpsonModel(R.drawable.flanders, R.string.ned_desc, R.string.ned),
            SimpsonModel(R.drawable.milhouse, R.string.milhouse_desc, R.string.milhouse),
            SimpsonModel(R.drawable.burns, R.string.burns_desc, R.string.burns)
        )

    }
}