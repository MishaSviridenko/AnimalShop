package com.andersen.training.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "basket")
@NoArgsConstructor
@Data
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "basket_id")
    private long basketId;

    @OneToMany(fetch = FetchType.EAGER) //OneDirection
    private List<Product> products;

    @Column(name = "product_count_in_basket")
    private int productCountInBasket;

}
