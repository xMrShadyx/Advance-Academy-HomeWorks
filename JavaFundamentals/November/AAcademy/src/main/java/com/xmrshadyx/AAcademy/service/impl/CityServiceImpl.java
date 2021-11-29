package com.xmrshadyx.AAcademy.service.impl;

import com.xmrshadyx.AAcademy.entity.City;
import com.xmrshadyx.AAcademy.repository.CityRepository;
import com.xmrshadyx.AAcademy.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findById(Long id) {
        return cityRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public City update(Long id, City city) {
        City foundCity = cityRepository.getById(id);
        City updatedCity = City.builder()
                .id(foundCity.getId())
                .name(city.getName())
                .city_population((city.getCity_population()))
                .build();

        return cityRepository.save(updatedCity);
    }

    @Override
    public void delete(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public void delete(String name) {
        City foundCity = cityRepository.findByName(name).orElseThrow(IllegalArgumentException::new);
        cityRepository.deleteByName(foundCity.getName());
    }
}
