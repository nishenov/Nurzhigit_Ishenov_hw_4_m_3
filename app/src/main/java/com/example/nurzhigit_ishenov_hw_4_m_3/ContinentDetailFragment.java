package com.example.nurzhigit_ishenov_hw_4_m_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.nurzhigit_ishenov_hw_4_m_3.databinding.FragmentContinentDetailBinding;

public class ContinentDetailFragment extends Fragment {
    private FragmentContinentDetailBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentContinentDetailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null ){
            Continent continent = (Continent) getArguments().getSerializable("continent");
            CountryAdapter adapter = new CountryAdapter(continent.getCountries());
            binding.rvCountries.setAdapter(adapter);
        }
    }
}