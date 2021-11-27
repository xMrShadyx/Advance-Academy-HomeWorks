package com.xmrshadyx.AAcademy.service;

import com.xmrshadyx.AAcademy.entity.City;

import java.util.List;

public interface CityService {

    City save(City city);

    List<City> findAll();

    City findById(Long id);

    // 2nd Part of HomeWork

    City update(Long id, City city);

    void delete(Long id);

    void delete(String name);
}
