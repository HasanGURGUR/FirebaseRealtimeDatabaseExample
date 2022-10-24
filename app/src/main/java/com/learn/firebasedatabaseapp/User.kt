package com.learn.firebasedatabaseapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val age: Int? = 0,
    val email: String? = "",
) : Parcelable
