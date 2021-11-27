package com.xmrshadyx.AAcademy.runner;

import com.xmrshadyx.AAcademy.entity.City;
import com.xmrshadyx.AAcademy.entity.Continent;
import com.xmrshadyx.AAcademy.entity.Country;
import com.xmrshadyx.AAcademy.service.CityService;
import com.xmrshadyx.AAcademy.service.ContinentService;
import com.xmrshadyx.AAcademy.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.util.*;


@Component
public class ApplicationRunner implements CommandLineRunner {

    private final CityService cityService;
    private final CountryService countryService;
    private final ContinentService continentService;

    @Autowired
    public ApplicationRunner(CityService cityService, CountryService countryService, ContinentService continentService) {
        this.cityService = cityService;
        this.countryService = countryService;
        this.continentService = continentService;
    }

    @Override
    public void run(String... args) throws Exception {

        Continent europe = Continent.builder().name("Europe").build();
        Continent southAmerica = Continent.builder().name("South America").build();
        Continent oceania = Continent.builder().name("Oceania").build();
        Continent asia = Continent.builder().name("Asia").build();
        Continent northAmerica = Continent.builder().name("North America").build();
        Continent antarctica = Continent.builder().name("Antarctica").build();
        Continent africa = Continent.builder().name("Africa").build();


        continentService.save(europe);
        continentService.save(southAmerica);
        continentService.save(oceania);
        continentService.save(asia);
        continentService.save(northAmerica);
        continentService.save(antarctica);
        continentService.save(africa);


        Country france = Country.builder().country_name("France").continent(europe).build();
        Country brazil = Country.builder().country_name("Brazil").continent(southAmerica).build();
        Country newZealand = Country.builder().country_name("New Zealand").continent(oceania).build();
        Country southKorea = Country.builder().country_name("South Korea").continent(asia).build();
        Country canada = Country.builder().country_name("Canada").continent(northAmerica).build();
        Country noneReal = Country.builder().country_name("No Real Countries").continent(antarctica).build();
        Country nigeria = Country.builder().country_name("Nigeria").continent(africa).build();

        countryService.save(france);
        countryService.save(brazil);
        countryService.save(newZealand);
        countryService.save(southKorea);
        countryService.save(canada);
        countryService.save(noneReal);
        countryService.save(nigeria);

        City marseille = City.builder().city_name("Marseille").city_population(861635L).country(france).build();
        City rioDeJaneiro = City.builder().city_name("Rio De Janeiro").city_population(6775561L).country(brazil).build();
        City auckland = City.builder().city_name("Auckland").city_population(1400000L).country(newZealand).build();
        City seoul = City.builder().city_name("Seoul").city_population(9586195L).country(southKorea).build();
        City toronto = City.builder().city_name("Toronto").city_population(4263000L).country(canada).build();
        City wholeContinent = City.builder().city_name("whole Continent").city_population(5000L).country(noneReal).build();
        City lagos = City.builder().city_name("Lagos").city_population(8048430L).country(nigeria).build();

        cityService.save(marseille);
        cityService.save(rioDeJaneiro);
        cityService.save(auckland);
        cityService.save(seoul);
        cityService.save(toronto);
        cityService.save(wholeContinent);
        cityService.save(lagos);

        List<City> cities = cityService.findAll();

        for (City city : cities) {
            String printable = String.format
                    ("In Continent: %s, have a country named: %s where in one of their cities named: %s have population of: %d amount of people.",
                            city.getCountry().getContinent().getName(),city.getCountry().getCountry_name(),
                            city.getCity_name(),city.getCity_population());
            System.out.println(printable);
        }

    }

}
