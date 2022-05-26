package com.example.springintro.service;

import com.example.springintro.entity.City;
import com.example.springintro.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public City deleteById(Long id) {
        City city = findById(id);
        if(city!=null) {
            cityRepository.delete(city);
            return city;
        }
        return null;
    }
}
