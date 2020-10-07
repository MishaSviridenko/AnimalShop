package com.andersen.training.model;

public class User {

    private long userId;
    private String userLogin;//????
    private String password;

//    @Transient
    private String confirmPassword;//В зависимости от того какую авторизацию
        //мы выберем подтверждение может не понадобится. Спринг сам сравнит с
        //учетной записью VK || Facebook.

//    @Embaded
   private UserProfile userProfile;
    private Basket basket; //OneToOne oneDirection

//    private ShoppingList shoppingList;
}

/*
CascadeType в Hib. может быть REFRESH , MERGE , ..., ALL
вы помещаете его под связанную сущность, и он определяет поведение
связанной сущности , если текущая сущность: обновлена, обновлена,
удалена, e.t.c.. Поэтому всякий раз, когда ваша сущность затронута,
CascadeType сообщает, должна ли быть затронута и связанная сущность.

Помните, что имеются некоторые различия между enum CascadeType в Hibernate
и в JPA. Поэтому обращайте внимание на импортируемый пакет при
использовании аннотации и константы типа. Наиболее часто используемые
CascadeType перечисления описаны ниже :
None : без каскадирования, т.е. никакая операция для родителя не будет
        иметь эффекта для ребенка;
ALL : все операции родителя будут отражены на ребенке (save, delete, update, evict, lock, replicate, merge, persist);
SAVE_UPDATE : операции save и update, доступно только для hibernate;
DELETE : в Hibernate передается действие native DELETE;
DETATCH, MERGE, PERSIST, REFRESH, REMOVE – для простых операций;
LOCK : передает в Hibernate native LOCK действие;
REPLICATE : передает в Hibernate native REPLICATE действие.



FetchType может быть только 2: EAGER и LAZY . Этот объект вы также
помещаете под Связанный объект, и он определяет, следует ли
инициализировать Связанный объект сразу же, когда инициализируется
текущий объект ( EAGER ) или только по требованию (LAZY ).
 */