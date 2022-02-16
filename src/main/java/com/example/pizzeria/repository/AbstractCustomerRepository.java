package com.example.pizzeria.repository;

import com.example.pizzeria.entities.Client;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public interface AbstractCustomerRepository {
    class ClientFirstName extends Client {
        String ClientFirstName = "Adam";
        String ClientFirstName1 = "Neal";
        String ClientFirstName2 = "Matt";
    }
    class ClientLastName{
        String ClientLastName = "Durban";
        String ClientLastName1 = "Nelson";
        String ClientLastName2 = "Pond";
    }
    class ClienAge extends Client{
        @GeneratedValue(strategy = GenerationType.AUTO)
        int age;
    }
    class ClientBankBallance extends Client{
        @GeneratedValue(strategy = GenerationType.AUTO)
        double BankBallance;
    }
}
