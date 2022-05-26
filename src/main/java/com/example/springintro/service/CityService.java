package com.example.springintro.service;

import com.example.springintro.entity.City;

import java.util.List;

public interface CityService {
    City save(City city);

    List<City> getAll();

    City findById(Long id);

    City deleteById(Long id);
}
