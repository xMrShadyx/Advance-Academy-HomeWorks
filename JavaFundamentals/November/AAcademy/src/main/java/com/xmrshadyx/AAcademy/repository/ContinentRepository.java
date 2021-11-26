package com.xmrshadyx.AAcademy.repository;

import com.xmrshadyx.AAcademy.entity.Continent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ContinentRepository extends JpaRepository<Continent, Long> {

}
