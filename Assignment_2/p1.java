class Employee {
    private int empId;
    private String name,dob,designation;
    private double basicSalary;

    Employee(int empId, String name, String dob, String designation, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.dob = dob;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    double calculateNetSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.90 * basicSalary;
        return basicSalary + hra + da;
    }

    void printData() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
    	System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

class p1{
    public static void main(String[] args) {
        Employee emp = new Employee(1, "SAYAK BAL", "02/08/2004", "Software Engineer", 50000);
        emp.printData();
    }
}
