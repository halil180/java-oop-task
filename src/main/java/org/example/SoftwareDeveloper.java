package org.example;


public class SoftwareDeveloper extends Employee implements ISoftwareDeveloper{
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private  String department;
    private String supervisor;
    protected  String skills;
    private  String experience;

    public SoftwareDeveloper(int id, String firstName, String lastName, int age, int salary, String department, Manager supervisor, String skills, int ex) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.skills = skills;
        this.age = age ;
        this.salary =salary;
        this.department = department;

    }


    @Override
    public void writeCode() {
        System.out.println( "Code has been written by :" + this.firstName + " " + this.lastName);

    }

    @Override
    public void testCode() {
        System.out.println( "Code has been tested by :" + this.firstName + " " + this.lastName);

    }

    @Override
    public void pushChanges() {
        System.out.println ("Code has been pushed by :" + this.firstName + " " + this.lastName);
    }
    
    @Override
    public String getSalaryPayment() {
        return this.firstName + " " + this.lastName +  " got 6500.0 CHF salary payment!";
    }

    @Override
    public void takeABreak() {
        System.out.println(this.firstName + " took a break!");
    }

    public String getSkills() {
        return  this.skills;
    }

    public String getDepartment() {
        return  this.department;
    }

    public double getSalary() {
        return this.salary;
    }
    // A Manager has Supervisor, skills, experience attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager
}