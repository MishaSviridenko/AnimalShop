package com.andersen.training.model;

public class User {

    private long userId;

    private String userLogin;//????
    private String userFirstName;
    private String userLastName;

    private String password;
    private String confirmPassword;//В зависимости от того какую авторизацию
        //мы выберем подтверждение может не понадобится. Спринг сам сравнит с
        //учетной записью VK || Facebook.


    private String email;
    private String telephoneNumber;
    private Basket basket;

//    private ShoppingList shoppingList;
}
