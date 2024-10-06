package PermanentEmployee;

import empPackage.Employee;

public class PermanentEmp extends Employee {
    public PermanentEmp(int id, String name, double basic, double DA, double HRA) {
        super(id, name, basic, DA, HRA);
    }


    public void display() {
        double totalSalary = basic + DA + HRA;
        super.display();
        System.out.println("Total Salary: " + totalSalary);
    }
}
