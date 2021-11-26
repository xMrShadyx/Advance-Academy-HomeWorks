package com.xmrshadyx.AAcademy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false, unique = true)
    private String country_name;

    @ManyToOne
//    @JoinTable(name = "countries_continents", joinColumns = @JoinColumn(name = "countries_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "continents_id", referencedColumnName = "id"))
    @JoinColumn(name = "continent_id", foreignKey = @ForeignKey(name = "fk_continent_id"))
    private Continent continent;


}
