package com.example.quiz2parsingapipublik.network
//NAMA : Fiqri Sepdian Hermawan P
//KELAS : IF-13
//NIM : 10122909
import com.example.quiz2parsingapipublik.model.University
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UniversityApi {
    @GET("search")
    fun getUniversities(@Query("country") country: String): Call<List<University>>
}