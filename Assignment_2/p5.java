class Person {
    protected String name;
    protected String address;
    protected int age;

    Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    protected String roll;
    protected String department;

    Student(String name, String address, int age, String roll, String department) {
        super(name, address, age);
        this.roll = roll;
        this.department = department;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Roll: " + roll);
        System.out.println("Department: " + department);
    }
}

class Faculty extends Person {
    protected String majorSubject;
    protected String publication;

    Faculty(String name, String address, int age, String majorSubject, String publication) {
        super(name, address, age);
        this.majorSubject = majorSubject;
        this.publication = publication;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Major Subject: " + majorSubject);
        System.out.println("Publication: " + publication);
    }
}

class ExStudent extends Student {
    private String organizationName;
    private String officeEmail;

    ExStudent(String name, String address, int age, String roll, String department, String organizationName, String officeEmail) {
        super(name, address, age, roll, department);
        this.organizationName = organizationName;
        this.officeEmail = officeEmail;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Office Email: " + officeEmail);
    }
}

class CurrentStudent extends Student {
    private int semester;
    private double sgpa;

    CurrentStudent(String name, String address, int age, String roll, String department, int semester, double sgpa) {
        super(name, address, age, roll, department);
        this.semester = semester;
        this.sgpa = sgpa;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("SGPA: " + sgpa);
    }
}

class p5 {
    public static void main(String[] args) {
        ExStudent exStudent = new ExStudent("Manas", "Kolaghat", 18, "29", "Computer Science", "GateIt", "partha@GateIt.com");
        System.out.println("Ex Student Details:");
        exStudent.displayDetails();
        System.out.println();

        CurrentStudent currentStudent = new CurrentStudent("Anwesha", "Mecheda", 18, "30", "CSE", 5, 9.9);
        System.out.println("Current Student Details:");
        currentStudent.displayDetails();
        System.out.println();

        Faculty faculty = new Faculty("Partha", "Ramtarak", 18, "Physics", "Quantum Mechanics");
        System.out.println("Faculty Details:");
        faculty.displayDetails();
    }
}
