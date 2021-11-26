package com.xmrshadyx.AAcademy.service.impl;

import com.xmrshadyx.AAcademy.entity.Continent;
import com.xmrshadyx.AAcademy.repository.ContinentRepository;
import com.xmrshadyx.AAcademy.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentServiceImpl implements ContinentService {

    private final ContinentRepository continentRepository;

    @Autowired
    public ContinentServiceImpl(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }

    @Override
    public Continent save(Continent continent) {
        return continentRepository.save(continent);
    }

    @Override
    public List<Continent> findAll() {
        return continentRepository.findAll();
    }

    @Override
    public Continent findById(Long id) {
        return continentRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

}
