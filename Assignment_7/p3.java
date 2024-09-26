import Theory.TMarks;
import Practical.PMarks;


class Student {
    public int rollNumber;
    public String name;
    public TMarks tMarks;
    public PMarks pMarks;

    public Student(int rollNumber, String name, TMarks tMarks, PMarks pMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.tMarks = tMarks;
        this.pMarks = pMarks;
    }

    public void calculateGrade() {
        int totalMarks = tMarks.marksTMath + tMarks.marksTPhy + tMarks.marksTChe +
                         pMarks.marksPMath + pMarks.marksPPhy + pMarks.marksPChe;

        int percentage = totalMarks / 6;

        String grade;
        if (percentage >= 90) {
            grade = "O";
        } else if (percentage >= 80) {
            grade = "E";
        } else if (percentage >= 70) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "Pass Class";
        } else {
            grade = "FAIL";
        }

        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + grade);
    }
}



public class p3 {
    public static void main(String[] args) {
        TMarks theoryMarks = new TMarks(85, 90, 78);
        PMarks practicalMarks = new PMarks(80, 88, 92);

        Student student = new Student(101, "Partha Sarathi Manna", theoryMarks, practicalMarks);
        student.calculateGrade();
    }
}
