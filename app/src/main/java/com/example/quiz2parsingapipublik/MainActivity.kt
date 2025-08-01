package com.example.quiz2parsingapipublik
//NAMA : Fiqri Sepdian Hermawan P
//KELAS : IF-13
//NIM : 10122909
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quiz2parsingapipublik.adapter.UniversityAdapter
import com.example.quiz2parsingapipublik.databinding.ActivityMainBinding
import com.example.quiz2parsingapipublik.model.University
import com.example.quiz2parsingapipublik.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvUniversities.layoutManager = LinearLayoutManager(this)

        RetrofitClient.instance.getUniversities("Indonesia").enqueue(object : Callback<List<University>> {
            override fun onResponse(call: Call<List<University>>, response: Response<List<University>>) {
                if (response.isSuccessful) {
                    val list = response.body() ?: emptyList()
                    binding.rvUniversities.adapter = UniversityAdapter(list)
                }
            }

            override fun onFailure(call: Call<List<University>>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Failed: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}