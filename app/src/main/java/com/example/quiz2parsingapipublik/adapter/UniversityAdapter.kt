package com.example.quiz2parsingapipublik.adapter
//NAMA : Fiqri Sepdian Hermawan P
//KELAS : IF-13
//NIM : 10122909
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz2parsingapipublik.databinding.ItemUniversityBinding
import com.example.quiz2parsingapipublik.model.University

class UniversityAdapter(private val list: List<University>) :
    RecyclerView.Adapter<UniversityAdapter.UnivViewHolder>() {

    inner class UnivViewHolder(val binding: ItemUniversityBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnivViewHolder {
        val binding = ItemUniversityBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return UnivViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UnivViewHolder, position: Int) {
        val item = list[position]
        holder.binding.apply {
            txtName.text = item.name
            txtCountry.text = item.country
            txtWebsite.text = item.webPages.firstOrNull() ?: "N/A"
        }
    }

    override fun getItemCount(): Int = list.size
}