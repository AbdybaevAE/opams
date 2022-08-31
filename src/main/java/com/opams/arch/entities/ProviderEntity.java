package com.opams.arch.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "product")
public class ProviderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "provider_id")
    private Long id;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "provider_name", nullable = false)
    private String providerName;

    @Column(name = "provider_mobile_number")
    private String providerMobileNumber;

    @Column(name = "provider_representative")
    private String providerRepresentative;
}
