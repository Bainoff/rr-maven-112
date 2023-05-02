package org.redrover;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CompanyTest {

    public Employee[] arr = new Employee[]{
            new Employee("ivan", 600),
            new Employee("vasa", 450),
            new Employee("vassa", 4550),
            new Employee("lenko", 320),
            new Employee("bazavr", 640)};

    public Manager[] arr2 = new Manager[]{
            new Manager(arr[0].getName(), arr[0].getBaseSalary(), 3),
            new Manager(arr[1].getName(), arr[1].getBaseSalary(), 2),
            new Manager(arr[2].getName(), arr[2].getBaseSalary(), 4),
            new Manager(arr[3].getName(), arr[3].getBaseSalary(), 14),
            new Manager(arr[4].getName(), arr[4].getBaseSalary(), 5)};

    @Test
    public void getNameTest() {
        Assert.assertEquals(Company.getEmployeeName("bazavr", arr), "worker number 5");
        Assert.assertEquals(Company.getEmployeeName("noname", arr), "There is no worker with this name");
    }

    @Test
    public void getNamePart() {
        Assert.assertEquals(Company.getEmployeeNamePart("ass", arr), "worker number 3");
    }


    @Test
    public void getCompSalary() {
        Assert.assertEquals(Company.getCompanySalary(arr), 6560);
    }

    @Test
    public void minSalary() {
        Assert.assertEquals(Company.getMinCompanySalary(arr), 320);
    }

    @Test
    public void maxSalary() {
        Assert.assertEquals(Company.getMaxCompanySalary(arr), 4550);
    }

    @Test
    public void minSubsNumber() {
        Assert.assertEquals(Company.getMinNumberOfSubordinates(arr2), 2);
    }

    @Test
    public void maxSubsNumber() {
        Assert.assertEquals(Company.getMaxNumberOfSubordinates(arr2), 14);
    }

    @Test
    public void maxManagerBonus() {
        Assert.assertEquals(Company.getMaxBonus(arr2), 546);
    }

    @Test
    public void minManagerBonus() {
        Assert.assertEquals(Company.getMinBonus(arr2), 27);
    }
}