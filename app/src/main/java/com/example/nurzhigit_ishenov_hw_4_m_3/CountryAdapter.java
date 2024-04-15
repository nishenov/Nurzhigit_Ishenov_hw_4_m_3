package com.example.nurzhigit_ishenov_hw_4_m_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nurzhigit_ishenov_hw_4_m_3.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    @NonNull
    ArrayList<String> countries;

    public CountryAdapter(@NonNull ArrayList<String> countries) {
        this.countries = countries;
    }

    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.onBind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }
}

class CountryViewHolder extends RecyclerView.ViewHolder {
    private ItemCountryBinding binding;

    public CountryViewHolder(@NonNull ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(String country){
        binding.tvCountry.setText(country);
    }
}

