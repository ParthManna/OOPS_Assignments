import java.util.*;

class p7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Value of a:");
		double a = sc.nextDouble();

		System.out.print("Enter the value of b:");
		double b = sc.nextDouble();

		System.out.print("Enter The value of c:");
		double c = sc.nextDouble();

		double d = b*b - 4*a*c;

		if(d>0){
			double r1 = (-b + Math.sqrt(d) / (2*a));
			double r2 = (-b - Math.sqrt(d) / (2*a));

			System.out.println("Roots are real and different");
			System.out.println("root1:"+r1);
			System.out.println("root2:"+r2);

		}else if(d==0){
			double r = -b /(2*a);
			System.out.println("Roots are real and equal");
			System.out.println("Root:"+r);

		}else	System.out.println("Root are Complex and Different");
	}
}
