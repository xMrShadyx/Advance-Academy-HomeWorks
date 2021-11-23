package com.xmrshadyx.AAcademy.service.impl;

import com.xmrshadyx.AAcademy.entity.Country;
import com.xmrshadyx.AAcademy.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryService countryService;

    @Autowired
    public CountryServiceImpl(CountryService countryService) {
        this.countryService = countryService;
    }

    @Override
    public Country save(Country country) {
        return null;
    }

    @Override
    public List<Country> findAll() {
        return null;
    }

    @Override
    public Country findById(Long id) {
        return null;
    }
}
