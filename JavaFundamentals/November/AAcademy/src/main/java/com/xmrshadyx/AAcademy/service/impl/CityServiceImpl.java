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
}
