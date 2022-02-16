package com.example.pizzeria.entities;

import com.example.pizzeria.repository.AbstractCustomerRepository;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
public class Client implements AbstractCustomerRepository {

    String FirstName;
    String LastName;
    int age;
    double BankBalance;

}
