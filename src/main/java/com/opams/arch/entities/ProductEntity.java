package com.opams.arch.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

    @GeneratedValue
    @Id
    private long productId;

    @NotNull
    @Positive
    private BigDecimal retailPrice;

    private String size;

    private String color;

    private String place;

    private String image;   //base64 string

    @ManyToOne(fetch = FetchType.LAZY)
    private OriginEntity origin;

    
}
