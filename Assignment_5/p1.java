import java.util.Scanner;

class Complex {
    int rn; 
    int in; 

    Complex(int r, int i) {
        this.rn = r;
        this.in = i;
    }

    public Complex sum(Complex c1, Complex c2) {
        return new Complex(c1.rn + c2.rn, c1.in + c2.in);
    }

    public Complex diff(Complex c1, Complex c2) {
        return new Complex(c1.rn - c2.rn, c1.in - c2.in);
    }

    public Complex product(Complex c1, Complex c2) {
        int realPart = c1.rn * c2.rn - c1.in * c2.in;
        int imagPart = c1.rn * c2.in + c1.in * c2.rn;
        return new Complex(realPart, imagPart);
    }

    public void display() {
        System.out.println("Complex Number: " + rn + " + " + in + "i");
    }
}

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("First Complex Number:");
        System.out.print("Enter Real and Imaginary parts: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        System.out.println("Second Complex Number:");
        System.out.print("Enter Real and Imaginary parts: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        System.out.println("First Complex Number:");
        c1.display();
        System.out.println("Second Complex Number:");
        c2.display();

        Complex sum = c1.sum(c1, c2);
        System.out.println("Sum:");
        sum.display();

        Complex diff = c1.diff(c1, c2);
        System.out.println("Difference:");
        diff.display();

  
        Complex product = c1.product(c1, c2);
        System.out.println("Product:");
        product.display();
    }
}
