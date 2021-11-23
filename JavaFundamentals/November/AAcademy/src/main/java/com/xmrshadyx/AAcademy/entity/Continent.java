package com.xmrshadyx.AAcademy.entity;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "continents")
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false, unique = true)
    private String continent_name;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Country> country;

}
