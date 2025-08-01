package com.example.quiz2parsingapipublik.model
//NAMA : Fiqri Sepdian Hermawan P
//KELAS : IF-13
//NIM : 10122909
import com.google.gson.annotations.SerializedName

data class University(
    val name: String,
    val country: String,
    @SerializedName("web_pages") val webPages: List<String>
)