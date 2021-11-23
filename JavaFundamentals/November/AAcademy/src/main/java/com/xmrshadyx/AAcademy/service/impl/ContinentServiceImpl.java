package com.xmrshadyx.AAcademy.service.impl;

import com.xmrshadyx.AAcademy.entity.Continent;
import com.xmrshadyx.AAcademy.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentServiceImpl implements ContinentService {

    private final ContinentService continentService;

    @Autowired
    public ContinentServiceImpl(ContinentService continentService) {
        this.continentService = continentService;
    }


    @Override
    public Continent save(Continent continent) {
        return null;
    }

    @Override
    public List<Continent> findAll() {
        return null;
    }

    @Override
    public Continent findById(Long id) {
        return null;
    }
}
