package com.example.pizzeria.entities;

import com.example.pizzeria.repository.AbstractEmploeeRepository;
import org.springframework.stereotype.Component;

@Component
public class Emploee implements AbstractEmploeeRepository {
    String Name;
    String Job;
    double WeekSalary ;
}
