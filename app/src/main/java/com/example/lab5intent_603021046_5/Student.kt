package com.myweb.lab5intent_603021046_5

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Student (val id: String, val name: String, val age: Int) : Parcelable {
}