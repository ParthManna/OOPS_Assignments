import java.util.*;

class p1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int n = sc.nextInt();

		if(n%2==0)	System.out.println("The Number "+n+" is Even");
		else		System.out.println("The Number "+n+" is Odd");

		}
}

