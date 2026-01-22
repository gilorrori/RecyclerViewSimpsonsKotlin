package com.gilorroristore.recyclerviewsimpsons.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SimpsonModel(
    @param:DrawableRes val image: Int,
    @param:StringRes val description: Int,
    @param:StringRes val name: Int
)