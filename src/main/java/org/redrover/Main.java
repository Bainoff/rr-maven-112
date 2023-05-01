package org.redrover;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee[] arr = new Employee[]{
                new Employee("ivan", 600),
                new Employee("vasa", 450),
                new Employee("vassa", 4550),
                new Employee("lenko", 320),
                new Employee("bazavr", 640)};

        Manager[] arr2 = new Manager[]{
                new Manager(arr[0].getName(), arr[0].getBaseSalary(), 3),
                new Manager(arr[1].getName(), arr[1].getBaseSalary(), 2),
                new Manager(arr[2].getName(), arr[2].getBaseSalary(), 4),
                new Manager(arr[3].getName(), arr[3].getBaseSalary(), 14),
                new Manager(arr[4].getName(), arr[4].getBaseSalary(), 5)};
        for (Manager i :
                arr2) {
            System.out.println(i.getSalaryManager() + " " + i.getBaseSalary() + " " + (i.getSalaryManager()-i.getBaseSalary()));
        }
    }

}