package com.example.mycourses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val nameStringId: Int,
    val students: Int,
    @DrawableRes val imageId: Int
)
