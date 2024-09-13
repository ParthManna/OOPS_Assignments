import java.util.Scanner;

class p2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size:");
		int a = sc.nextInt();
		int n[] = new int[a];

		System.out.print("Enter Numbers:");
		for(int i=0; i < n.length; i++)	n[i]=sc.nextInt();

		int max = n[0],min = n[0];

		for(int i=1; i < n.length; i++){
			if(max < n[i])	max = n[i];
			if(min > n[i])	min = n[i];
		}
		System.out.println("Maximum Number is: "+max);
		System.out.println("Minimum Number is: "+min);
	}
}
