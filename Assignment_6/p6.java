// Student class
class Student {
    protected int roll;

    public void getRoll(int roll) {
        this.roll = roll;
    }

    public void displayRoll() {
        System.out.println("Roll number: " + roll);
    }
}

// Test class (inherits from Student)
class Test extends Student {
    protected float m1, m2;

    public void getMarks(float m1, float m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    public void displayMarks() {
        System.out.println("Marks 1: " + m1);
        System.out.println("Marks 2: " + m2);
    }
}

// Games Interface
interface Games {
    float gamewt = 8.0f;

    void displayWT();
}

// Result class (inherits from Test and implements Games)
class Result extends Test implements Games {

    @Override
    public void displayWT() {
        System.out.println("Games weight: " + gamewt);
    }

    public void displayResult() {
        displayRoll();
        displayMarks();
        displayWT();
        float total = m1 + m2 + gamewt;
        System.out.println("Total score: " + total);
    }
}
// Main class to execute the program
public class p6 {
    public static void main(String[] args) {
        Result student = new Result();
        
        student.getRoll(101);  // Providing roll number
        student.getMarks(85.5f, 90.0f);  // Providing marks for two subjects

        student.displayResult();  // Displaying result with total score
    }
}



