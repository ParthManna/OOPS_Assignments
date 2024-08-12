class Staff {
    protected String name;
    protected String address;

    Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

class FullTimeStaff extends Staff {
    private String department;
    private double salary;

    FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

class PartTimeStaff extends Staff {
    private int numberOfHours;
    private double ratePerHour;

    PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Rate Per Hour: $" + ratePerHour);
    }
}

class p4 {
    public static void main(String[] args) {
        FullTimeStaff fullTimeStaff = new FullTimeStaff("Sohan", "Mecheda", "CSE", 60000);
        System.out.println("Full Time Staff Details:");
        fullTimeStaff.displayDetails();
        System.out.println();

        PartTimeStaff partTimeStaff = new PartTimeStaff("Ganguli", "Ramtarak", 20, 15);
        System.out.println("Part Time Staff Details:");
        partTimeStaff.displayDetails();
    }
}
