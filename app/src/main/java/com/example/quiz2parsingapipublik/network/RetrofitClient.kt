package com.example.quiz2parsingapipublik.network
//NAMA : Fiqri Sepdian Hermawan P
//KELAS : IF-13
//NIM : 10122909
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "http://universities.hipolabs.com/"

    val instance: UniversityApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UniversityApi::class.java)
    }
}