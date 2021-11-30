package com.xmrshadyx.AAcademy.controller;

import com.xmrshadyx.AAcademy.entity.Country;
import com.xmrshadyx.AAcademy.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    private final CountryService countryService;


    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    //COUNTRY METHODS
    @GetMapping(value = "/countries")
    private List<Country> findAllCountries() {
        return countryService.findAll();
    }
//    CREATE COUNTRY
//    {
//        "name": "France",
//            "continent": {
//        "id": 1
//    }
//    }

    @PostMapping(value = "/save/country")
    public ResponseEntity<Country> saveCountry(@RequestBody Country country) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(countryService.save(country));
    }

    @DeleteMapping(value = "/delete/country/{id}")
    public ResponseEntity<HttpStatus> deleteCountryById(@PathVariable Long id) {
        countryService.delete(id);
        return ResponseEntity.ok().build();
    }
}
