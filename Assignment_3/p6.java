import java.util.*;

class p6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int n=sc.nextInt();
		int f=1;
		for(int i=2; i<=n; i++)	f *= i;
		System.out.printf("Factorial of %d is %d\n",n,f);
	}
}
