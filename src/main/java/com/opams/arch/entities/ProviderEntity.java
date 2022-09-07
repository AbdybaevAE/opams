package com.opams.arch.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "provider")
public class ProviderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "city_id", nullable = false)
    private String cityId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "mobile_number", nullable = false)
    private String mobileNumber;

    @Column(name = "representative")
    private String representative;

    @ManyToOne(targetEntity = ProductEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private CityEntity provider;
}
