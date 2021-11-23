package com.xmrshadyx.AAcademy.service;

import com.xmrshadyx.AAcademy.entity.Continent;

import java.util.List;


public interface ContinentService {

    Continent save(Continent continent);

    List<Continent> findAll();

    Continent findById(Long id);
}
