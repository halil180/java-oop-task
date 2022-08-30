package org.example;

import java.util.ArrayList;

public class Manager extends Employee implements IManager{



    ///wrong ??
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private  String department;


    ArrayList<Employee> employees = new ArrayList<Employee>();
/////


    public Manager(int id, String firstName, String lastName, int age, int salary, String department) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary =salary;
        this.department = department;
    }

    @Override
    public void increaseSalary() {

    }

    @Override
    public void hireEmployee() {

    }

    @Override
    public void fireEmployee() {

    }

    @Override
    public void getNumberOfEmployeesSupervised() {
        System.out.println(this.firstName + " has "  + employees.size() + " employees") ;
    }

    @Override
    public String getSalaryPayment() {
        System.out.println(this.firstName + " " + this.lastName +  "  got " +this.salary + " CHF salary payment!");
        return this.firstName + " " + this.lastName +  " got 6500.0 CHF salary payment!";
    }
    @Override
    public void takeABreak() {
        System.out.println(this.firstName + " took a break!");
    }

    public void getEmployees() {

        System.out.println(this.firstName +  "  " +this.lastName + "s Employees");
        for(Employee employees : employees){
            System.out.println(employees.getFirstName() + " " + employees.getLastName());
        }

    }

    

    public void increaseSalary(SoftwareDeveloper softwareDeveloper1, double i) {
        super.getSalaryPayment();

        this.salary = this.salary + i;
        System.out.println(softwareDeveloper1.getFirstName()+ " " + softwareDeveloper1.getLastName()+ "s salary " +  " is increased"   + i +"  CHF" + "New Salary :    " + this.salary + i);
    }

    public void fireEmployee(Employee employee) {
        employees.remove(employee);

        System.out.println( employee.getFirstName() + " is fired!");

    }

    public void hireEmployee(Employee newEmployee) {
        employees.add(newEmployee);

        System.out.println(newEmployee.getFirstName() + " is hired");
    }


    // A Manager has numberOfEmployeesSupervised attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager





}