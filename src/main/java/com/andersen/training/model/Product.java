package com.andersen.training.model;

import java.util.Set;

public class Product {

    private long productId;
    private String productName;
//    @Embaded
    private ProductDescription productDescription; //Тоже можно сделать отдельным классом
                                    // и определить поля с описанием товара
    private long price;
    private int discountPrice; // цена со скидкой
    private int productsCount;
    private Set<Category> categories;

    private Basket basket; //OneToOne oneDirection

}
