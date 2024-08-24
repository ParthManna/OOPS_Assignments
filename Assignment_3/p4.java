import java.util.*;

class p4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Digits:");
		int sum=0;
		int n = sc.nextInt();
		int r=0;

		while(n>0){
			int a=n%10;
			sum = sum + a;
			r = r*10 + a;
			n=n/10;
		}

		System.out.println("Sum of Digits:"+sum);
		System.out.println("Reverse of Digits:"+r);
	}
}
