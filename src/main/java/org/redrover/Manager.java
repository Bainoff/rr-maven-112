package org.redrover;

public class Manager extends Worker{
//TODO Задача №2.2
// Необходимо создать класс Manager в который нужно добавить следующие методы:
// getNumberOfSubordinates - получить количество подчиненных
// setNumberOfSubordinates
// в классе, метод getSalaryManager будет возвращать значение по формуле
// - <базовая ставка> * (<количество подчиненных> / 100 * 3).
// Если количество подчиненных 0, то результат как у обычного рабочего.
    private int numOfSubs;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numOfSubs = numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numOfSubs) {this.numOfSubs = numOfSubs;}

    public int getNumberOfSubordinates() {return numOfSubs;}

    public int getSalaryManager() {
        if (numOfSubs > 0) return (int) (getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3));
        else return getSalaryWorker();
    }
}
