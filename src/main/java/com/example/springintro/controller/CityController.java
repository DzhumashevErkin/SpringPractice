package com.example.springintro.controller;

import com.example.springintro.entity.City;
import com.example.springintro.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getAllCities(){
        return cityService.getAll();
    }


    @GetMapping("/{cityId}")
    public City getById(@PathVariable Long cityId){
        return cityService.findById(cityId);
    }

    @PostMapping
    public City create(@RequestBody City city){
        return cityService.save(city);
    }

    @DeleteMapping("/{cityId}")
    public City deleteById(@PathVariable Long cityId){
        return cityService.deleteById(cityId);
    }

}
