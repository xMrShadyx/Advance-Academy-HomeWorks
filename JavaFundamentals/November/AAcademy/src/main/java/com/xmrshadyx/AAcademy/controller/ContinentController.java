package com.xmrshadyx.AAcademy.controller;

import com.xmrshadyx.AAcademy.entity.Continent;
import com.xmrshadyx.AAcademy.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContinentController {


    private final ContinentService continentService;

    @Autowired
    public ContinentController(ContinentService continentService) {
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
}
