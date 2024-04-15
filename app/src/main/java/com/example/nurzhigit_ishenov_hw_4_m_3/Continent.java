package com.example.nurzhigit_ishenov_hw_4_m_3;

import java.io.Serializable;
import java.util.ArrayList;

public class Continent implements Serializable {
    private String name;
    private String map;
    private ArrayList<String> countries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public ArrayList<String> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<String> countries) {
        this.countries = countries;
    }

    public Continent(String name,ArrayList<String> countries, String map) {
        this.name = name;
        this.countries = countries;
        this.map = map;
    }
}
