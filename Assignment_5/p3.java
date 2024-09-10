import java.util.Scanner;

class CSEallStudent {
    int r;
    String n, dep;

    void getData(Scanner sc) {
        r = sc.nextInt();
	    sc.nextLine();
        n = sc.nextLine();
        dep = sc.nextLine();
    }

    void putData() {
        System.out.println("Roll: " + r);
        System.out.println("Name: " + n);
        System.out.println("Department: " + dep);
    }

    final void deptRules() {
        System.out.println("75% Attendance in class");
        System.out.println("90% Attendance in Lab");
    }
}

class CSE3year extends CSEallStudent {
    int oppMarks;
    String tech_fest_part;

    void getData(Scanner sc) {
        super.getData(sc);
        oppMarks = sc.nextInt();
	sc.nextLine();
        tech_fest_part = sc.nextLine();
    }

    void putData() {
        super.putData();
        System.out.println("Opportunity Marks: " + oppMarks);
        System.out.println("Tech Fest Participation: " + tech_fest_part);
    }
}

class CSE4year extends CSEallStudent {
    double projMarks;
    String placement;


    void getData(Scanner sc) {
        super.getData(sc);
        projMarks = sc.nextDouble();
	    sc.nextLine();
        placement = sc.nextLine();
    }

    void putData() {
        super.putData(); 
        System.out.println("Project Marks: " + projMarks);
        System.out.println("Placement Record: " + placement);
    }
}

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CSE3year c3 = new CSE3year();
        System.out.println("Enter data for CSE3year student:");
        c3.getData(sc);
        c3.putData();


        CSE4year c4 = new CSE4year();
        System.out.println("Enter data for CSE4year student:");
        c4.getData(sc);
        c4.putData();

	    CSEallStudent c = new CSEallStudent();
	    c.deptRules();
    }
}

