package com.example.pizzeria.entities;

import com.example.pizzeria.repository.AbstractIngredientsRepository;
import org.springframework.stereotype.Component;

@Component
public class Pizza implements AbstractIngredientsRepository {
    String Name;
    String IngredientList;
    double SalesQuantity;
}
