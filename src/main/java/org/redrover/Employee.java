package org.redrover;

public class Employee {
//TODO Задача №1
// Необходимо создать класс Employee со следующими методами:
// getName - получить имя
// setName
// getBaseSalary - базовая ставка
// setBaseSalary

    private String name;
    private int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getBaseSalary() {return baseSalary;}

    public void setBaseSalary(int baseSalary) {this.baseSalary = baseSalary;}
}
