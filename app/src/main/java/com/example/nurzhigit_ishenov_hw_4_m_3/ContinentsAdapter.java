package com.example.nurzhigit_ishenov_hw_4_m_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.nurzhigit_ishenov_hw_4_m_3.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Continent> continents;
    private OnClick onClick;

    public ContinentsAdapter(ArrayList<Continent> continents, OnClick onClick) {
        this.continents = continents;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(continents.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;

    public ViewHolder(@NonNull ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Continent continent) {
        binding.tvContinents.setText(continent.getName());
        Glide.with(binding.ivContinent).load(continent.getMap()).into(binding.ivContinent);
    }
}
