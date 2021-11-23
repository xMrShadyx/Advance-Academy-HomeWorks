package com.xmrshadyx.AAcademy.service;

import com.xmrshadyx.AAcademy.entity.City;

import java.util.List;

public interface CityService {

    City save(City city);

    List<City> findAll();

    City findById(Long id);
}
