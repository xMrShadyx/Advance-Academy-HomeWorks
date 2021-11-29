package com.xmrshadyx.AAcademy.service.impl;

import com.xmrshadyx.AAcademy.entity.Country;
import com.xmrshadyx.AAcademy.repository.CountryRepository;
import com.xmrshadyx.AAcademy.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findById(Long id) {
        return countryRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public Country findByName(String name) {
        return countryRepository.findByName(name).orElseThrow(IllegalArgumentException::new);
    }

    // 2nd Part of HomeWork

    @Override
    public Country update(Long id, Country country) {
        Country foundCountry = this.findById(id);
        Country updatedCountry = Country.builder()
                .id(foundCountry.getId())
                .name(country.getName())
                .build();
        return countryRepository.save(updatedCountry);
    }

    @Override
    public void delete(Long id) {
        countryRepository.deleteById(id);
    }

    @Override
    public void delete(String name) {
        Country country = countryRepository.findByName(name)
                .orElseThrow(IllegalArgumentException::new);

        countryRepository.deleteByName(country.getName());

    }
}
