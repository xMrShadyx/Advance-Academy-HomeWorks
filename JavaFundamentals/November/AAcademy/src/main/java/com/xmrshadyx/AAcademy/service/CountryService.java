package com.xmrshadyx.AAcademy.service;

import com.xmrshadyx.AAcademy.entity.Country;

import java.util.List;

public interface CountryService {

    Country save(Country country);

    List<Country> findAll();

    Country findById(Long id);
}
