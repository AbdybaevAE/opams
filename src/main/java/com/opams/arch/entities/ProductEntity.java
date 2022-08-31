package com.opams.arch.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "product_id")
    private Long Id;

    @Column(name = "provider_id")
    private Long providerId;

    @NotNull
    @Positive
    @Column(name = "retail_price", nullable = false)
    private BigDecimal retailPrice;

    @Column(name = "image")
    private String image;   //link to image

    @ManyToOne(targetEntity = ProductEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "provider_id", referencedColumnName = "provider_id")
    private ProviderEntity provider;

}
