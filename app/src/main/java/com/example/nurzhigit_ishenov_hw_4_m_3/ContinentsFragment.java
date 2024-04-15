package com.example.nurzhigit_ishenov_hw_4_m_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nurzhigit_ishenov_hw_4_m_3.databinding.FragmentContinentsBinding;

import java.util.ArrayList;

public class ContinentsFragment extends Fragment implements OnClick{
    private FragmentContinentsBinding binding;
    private ArrayList<Continent> continents = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentContinentsBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentsAdapter adapter = new ContinentsAdapter(continents, this);
        binding.rvContinents.setAdapter(adapter);
    }

    public void loadData() {
        ArrayList<String> asia = new ArrayList<>();
        asia.add("Korea");
        asia.add("China");
        asia.add("Kyrgyzstan");
        asia.add("Kazahstan");
        asia.add("Thailand");

        ArrayList<String> europe = new ArrayList<>();
        europe.add("France");
        europe.add("German");
        europe.add("Spain");
        europe.add("Denmark");
        europe.add("Poland");

        ArrayList<String> southAmerica = new ArrayList<>();
        southAmerica.add("Brazil");
        southAmerica.add("Argentine");
        southAmerica.add("Peru");
        southAmerica.add("Chile");
        southAmerica.add("Bolivia");

        ArrayList<String> northAmerica = new ArrayList<>();
        northAmerica.add("USA");
        northAmerica.add("Canada");
        northAmerica.add("Mexico");
        northAmerica.add("Cuba");
        northAmerica.add("Haiti");

        ArrayList<String> australia = new ArrayList<>();
        australia.add("Australia");
        australia.add("Kiribati");
        australia.add("Nauru");
        australia.add("Palau");
        australia.add("Samoa");

        continents.add(new Continent("Asia", asia , "https://www.pngall.com/wp-content/uploads/5/Asia-Map-PNG-Free-Download.png"));
        continents.add(new Continent("Europe", europe, "https://png.pngtree.com/png-vector/20220610/ourmid/pngtree-blue-europe-map-on-a-white-background-in-flat-png-image_4947413.png"));
        continents.add(new Continent("South America", southAmerica, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/South_America.svg/1200px-South_America.svg.png"));
        continents.add(new Continent("North America", northAmerica, "https://images.vexels.com/media/users/3/279738/isolated/preview/8a8771c38373705f7f33ca422c296135-north-america-flat-continents-map.png"));
        continents.add(new Continent("Australia",australia, "https://png.pngtree.com/png-vector/20230909/ourmid/pngtree-australia-map-terrain-png-image_9224346.png"));
    }

    @Override
    public void onClick(int position) {
        Continent continent = continents.get(position);
        Bundle bundle = new Bundle();
        bundle.putSerializable("continent", continent);
        ContinentDetailFragment fragment = new ContinentDetailFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_continents, fragment).addToBackStack(null).commit();
    }
}