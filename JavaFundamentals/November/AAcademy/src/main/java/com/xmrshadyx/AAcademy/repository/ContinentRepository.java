package com.xmrshadyx.AAcademy.repository;

import com.xmrshadyx.AAcademy.entity.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {

    Optional<Continent> findByName(String name);
    void deleteByName(String name);

}
