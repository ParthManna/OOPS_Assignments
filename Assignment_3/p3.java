import java.util.*;

class p3{

	public static boolean isPrime(int i){
		if(i<=2)	return false;

		for(int j=2; j<=Math.sqrt(i); j++)	if(i % j == 0)	return false;

		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range:");
		int n = sc.nextInt();
		int count =0;
		System.out.println("Prime Numbers:");

		for(int i=1; i<=n; i++){
			if(isPrime(i)){
				count++;
				System.out.println(i+" ");
			}
		}
		System.out.println("Total Prime Numbers:"+count);
	}
}

