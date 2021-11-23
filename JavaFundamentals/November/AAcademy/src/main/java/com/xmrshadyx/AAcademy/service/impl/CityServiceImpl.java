package com.xmrshadyx.AAcademy.service.impl;

import com.xmrshadyx.AAcademy.entity.City;
import com.xmrshadyx.AAcademy.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityService cityService;

    @Autowired
    public CityServiceImpl(CityService cityService) {
        this.cityService = cityService;
    }

    @Override
    public City save(City city) {
        return null;
    }

    @Override
    public List<City> findAll() {
        return null;
    }

    @Override
    public City findById(Long id) {
        return null;
    }
}
