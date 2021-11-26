package com.xmrshadyx.AAcademy.repository;

import com.xmrshadyx.AAcademy.entity.City;
import com.xmrshadyx.AAcademy.entity.Continent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Long> {


}
