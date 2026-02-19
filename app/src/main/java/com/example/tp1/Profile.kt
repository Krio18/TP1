package com.example.tp1

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import java.util.Date

@Parcelize
data class Profile (
    val firstName: String,
    val lastName: String,
    val birthday: Date,
    val IDUL: String,
) : Parcelable