package com.andersen.training.model;

import java.util.Set;

public class Product {

    private long productId;
    private String productName;
    private String productDescription; //Тоже можно сделать отдельным классом
                                    // и определить поля с описанием товара
    private long price; //Может сделаем отдельный класс Price???
    private int productsNumber;
    private Set<Category> categories;

    private Basket basket; //В моем понимании, товар ничего не может знать о корзине!

}
