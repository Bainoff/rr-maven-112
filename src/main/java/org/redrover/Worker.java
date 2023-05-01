package org.redrover;

public class Worker extends Employee {
    public Worker(String name, int baseSalary) {
        super(name, baseSalary);
    }

// TODO    Задача №2.1
// Необходимо создать класс Worker где метод getSalaryWorker  будет возвращать зарплату, базовую ставку.

    public int getSalaryWorker(){return getBaseSalary();}
}
