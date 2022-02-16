package com.example.pizzeria.repository;

import com.example.pizzeria.entities.Emploee;

public interface AbstractEmploeeRepository {
    class EmploeeName extends Emploee {
        String EmploeeName = "Mark";
        String EmploeeName1 = "John";
        String EmploeeName2 = "Kevin";
    }
    class EmploeeJob extends Emploee{
        String EmploeeJob = "Admin";
        String EmploeeJob1 = "Worker";
    }
    class EmploeeSalary extends Emploee{
        double WorkerSalary = 100;
        double AdminSalary = 150;
    }
}
