package org.example;


public class SoftwareDeveloper extends Employee implements ISoftwareDeveloper{

    private Manager supervisor;
    private   String skills;
    private  int experience;

    public SoftwareDeveloper(int id, String firstName, String lastName, int age, int salary, String department, Manager supervisor, String skills, int experience) {

        super(id,firstName,lastName,age,salary,department);
        this.skills = skills;
        this.experience = experience;
        this.supervisor = supervisor;

    }


    @Override
    public void writeCode() {
        System.out.println( "Code has been written by :" + getFirstName() + " " + getLastName());

    }

    @Override
    public void testCode() {
        System.out.println( "Code has been tested by :" + getFirstName() + " " + getLastName());

    }

    @Override
    public void pushChanges() {
        System.out.println ("Code has been pushed by :" + getFirstName() + " " + getLastName());
    }
    
    @Override
    public String getSalaryPayment() {
        System.out.println(getFirstName() + " " + getLastName() +  " got  " +  getSalary() + "CHF salary payment!");
        return getFirstName() + " " + getLastName() +  " got  " +  getSalary() + "CHF salary payment!";
    }

    @Override
    public void takeABreak() {
        System.out.println(getFirstName() + " took a break!");
    }

    public String getSkills() {
        return  this.skills;
    }

    // A Manager has Supervisor, skills, experience attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager
}