package com.example.pizzeria.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String FirstName;
    String LastName;
    String Job;
    String Ingredient;
    double IngredientPrice;
    double WeekSalary;
    double BuyPrice;
    double SellPrice;
    int age;
    double BankBalance;
    double SalesQuantity;
}
