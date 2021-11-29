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
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false, unique = true)
    private String name;

    private Long city_population;

    @ManyToOne
//    @JoinTable(name = "cities_countries", joinColumns = @JoinColumn(name = "city_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "countries_id", referencedColumnName = "id"))
    @JoinColumn(name = "country_id", foreignKey = @ForeignKey(name = "fk_country_id"))
    private Country country;


}
