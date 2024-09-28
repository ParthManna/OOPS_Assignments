// File: empPackage/Employee.java
package empPackage;

public class Employee {
    protected int id;
    protected String name;
    protected double basic, DA, HRA;

    public Employee(int id, String name, double basic, double DA, double HRA) {
        this.id = id;
        this.name = name;
        this.basic = basic;
        this.DA = DA;
        this.HRA = HRA;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
    }
}

