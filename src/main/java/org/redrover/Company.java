package org.redrover;

public class Company {
// TODO   Задача №3

// Необходимо создать класс со следующими методами:

//    public Employee[] workers;
//    public Manager[] managers;

//    public Company(Employee[] workers) {
//        for (int i = 0; i < workers.length; i++) {
//            workers[i] = new Employee(workers[i].getName(), workers[i].getBaseSalary());
//        }
//    }
//
//    public Company(Manager[] managers) {
//        for (int i = 0; i < managers.length; i++) {
//            managers[i] = new Manager(managers[i].getName(), managers[i].getBaseSalary(), managers[i].getNumberOfSubordinates());
//        }
//    }
//TODO поиск сотрудника в массиве по его имени

    public static String getEmployeeName(String name, Employee[] workers) {
        for (int i = 0; i < workers.length; i++) {
            if (name.equals(workers[i].getName())) return "worker number " + (i + 1);
        }
        return "There is no worker with this name";
    }

//TODO поиск сотрудника в массиве по вхождению указанной строки в его имени

    public static String getEmployeeNamePart(String namePart, Employee[] workers) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(namePart)) return "worker number " + (i + 1);
        }
        return "There is no worker with this name";
    }

//TODO подсчет зарплатного бюджета для всех сотрудников в массиве

    public static int getCompanySalary(Employee[] workers) {
        int compSalary = 0;
        for (Employee worker : workers) {
            compSalary += worker.getBaseSalary();
        }
        return compSalary;
    }

//TODO поиск наименьшей зарплаты в массиве

    public static int getMinCompanySalary(Employee[] workers) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee worker : workers) {
            if (worker.getBaseSalary() < minSalary) minSalary = worker.getBaseSalary();
        }
        return minSalary;
    }

//TODO поиск наибольшей зарплаты в массиве

    public static int getMaxCompanySalary(Employee[] workers) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee worker : workers) {
            if (worker.getBaseSalary() > maxSalary) maxSalary = worker.getBaseSalary();
        }
        return maxSalary;
    }

//TODO поиск наименьшего количества подчиненных в массиве менеджеров

    public static int getMinNumberOfSubordinates(Manager[] managers) {
        int minNumOfSubs = Integer.MAX_VALUE;
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() < minNumOfSubs) minNumOfSubs = manager.getNumberOfSubordinates();
        }
    return minNumOfSubs;}

//TODO поиск наибольшего количества подчиненных в массиве менеджеров

    public static int getMaxNumberOfSubordinates(Manager[] managers) {
        int maxNumOfSubs = Integer.MIN_VALUE;
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() > maxNumOfSubs) maxNumOfSubs = manager.getNumberOfSubordinates();
        }
        return maxNumOfSubs;}

//TODO поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static int getMaxBonus(Manager[] managers) {
        int maxBonus = Integer.MIN_VALUE;
        for (Manager manager : managers) {
            if ((manager.getSalaryManager() - manager.getBaseSalary()) > maxBonus)
                maxBonus = manager.getSalaryManager() - manager.getBaseSalary();
        }
    return maxBonus;}

//TODO поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static int getMinBonus(Manager[] managers) {
        int minBonus = Integer.MAX_VALUE;
        for (Manager manager : managers) {
            if ((manager.getSalaryManager() - manager.getBaseSalary()) < minBonus)
                minBonus = manager.getSalaryManager() - manager.getBaseSalary();
        }
        return minBonus;}
}
