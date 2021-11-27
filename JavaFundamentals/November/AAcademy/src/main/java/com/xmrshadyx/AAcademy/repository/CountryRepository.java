package com.xmrshadyx.AAcademy.repository;

import com.xmrshadyx.AAcademy.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Optional<Country> findByName(String name);

    void deleteByName(String name);
}
