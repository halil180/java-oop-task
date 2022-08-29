package org.example;

public class Employee implements IEmployee{
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private  String department;

    public Employee() {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age ;
        this.salary =salary;
        this.department = department;
    }


    @Override
    public String getSalaryPayment() {
        return this.firstName + " " + this.lastName +  " got 6500.0 CHF salary payment!";
    }

    @Override
    public void takeABreak() {

        System.out.println(   this.firstName + " took a break!");
    }


    // Please implement necessary methods to get and set these attributes of employee
    // All methods should only print the name of the employee (Manager or SoftDev) and the name of the method.
}