package com.example.pizzeria.entities;

import com.example.pizzeria.repository.AbstractIngredientsRepository;
import org.springframework.stereotype.Component;

@Component
public class Ingredients implements AbstractIngredientsRepository {
    String Name;
    double BuyPrice;
    double SellPrise;
}
