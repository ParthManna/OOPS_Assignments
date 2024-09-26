import Prime.Prime;
import Factorial.Factorial;
import java.util.Scanner;

class p2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int n1 = sc.nextInt();

		Prime p = new Prime();
		p.testP(n1);

		System.out.print("Enter Number:");
		int n2 = sc.nextInt();
		Factorial f = new Factorial();
		f.testF(n2);
	}
}
