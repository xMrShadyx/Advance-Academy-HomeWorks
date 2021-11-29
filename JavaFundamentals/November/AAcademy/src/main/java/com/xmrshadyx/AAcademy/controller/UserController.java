package com.xmrshadyx.AAcademy.controller;

import com.xmrshadyx.AAcademy.entity.City;
import com.xmrshadyx.AAcademy.entity.Continent;
import com.xmrshadyx.AAcademy.entity.Country;
import com.xmrshadyx.AAcademy.service.CityService;
import com.xmrshadyx.AAcademy.service.ContinentService;
import com.xmrshadyx.AAcademy.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final CityService cityService;
    private final CountryService countryService;
    private final ContinentService continentService;

    @Autowired
    public UserController(CityService cityService, CountryService countryService, ContinentService continentService) {
        this.cityService = cityService;
        this.countryService = countryService;
        this.continentService = continentService;
    }

    //CONTINENT METHODS
    @GetMapping(value = "/continents")
    private List<Continent> findAllContinents() {
        return continentService.findAll();
    }
//    CREATE CONTINENT
//    {
//        "name": "Europe",
//    }

    @PostMapping(value = "/save/continent")
    public ResponseEntity<Continent> saveCountry(@RequestBody Continent continent) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(continentService.save(continent));
    }


    @DeleteMapping(value = "/delete/continent/{id}")
    public ResponseEntity<HttpStatus> deleteContinentById(@PathVariable Long id) {
        continentService.delete(id);
        return ResponseEntity.ok().build();
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

    // CITY METHODS
    @GetMapping(value = "/cities")
    private List<City> findAllCities() {
        return cityService.findAll();
    }
    // CREATE CITY: localhost:8081/save/city/Bremen/89999/1
    @PostMapping(value = "/save/city/{name}/{population}/{country}")
    public ResponseEntity<City> saveCity(@PathVariable String name,
                                     @PathVariable Long population,
                                     @PathVariable Long countryId) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(cityService.save(City.builder()
                        .name(name)
                        .city_population(population)
                        .country(countryService.findById(countryId))
                        .build()));
    }
//   CREATE CITY
//    {
//        "name": "Lagos",
//            "city_population": 12345678,
//            "country": {
//        "id": 7
//    }
//    }

    @PostMapping(value = "/save/city")
    public ResponseEntity<City> saveCity(@RequestBody City city) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(cityService.save(city));
    }

    @DeleteMapping(value = "/delete/city/{id}")
    public ResponseEntity<HttpStatus> deleteCityById(@PathVariable Long id) {
        cityService.delete(id);
        return ResponseEntity.ok().build();
    }

}
