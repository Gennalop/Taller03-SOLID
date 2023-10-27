/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.secciona;

interface SalaryCalculator {
    double calculateSalary();
}

class HourlyEmployee implements SalaryCalculator {
    public double calculateSalary() {
        // Cálculo del salario por hora
        return 40.0 * 10.0; // Ejemplo simplificado
    }
}

class SalariedEmployee implements SalaryCalculator {
    public double calculateSalary() {
        // Cálculo del salario mensual
        return 4000.0; // Ejemplo simplificado
    }
}

class Contractor implements SalaryCalculator {
    public double calculateSalary() {
        // Cálculo del salario por contrato
        return 1000.0; // Ejemplo simplificado
    }
}

class Employee {
    private String name;
    private SalaryCalculator salaryCalculator;

    public Employee(String name, SalaryCalculator salaryCalculator) {
        this.name = name;
        this.salaryCalculator = salaryCalculator;
    }

    public double calculateSalary() {
        return salaryCalculator.calculateSalary();
    }
}

