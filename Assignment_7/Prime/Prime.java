package Prime;

public class Prime{
	public void testP(int n){
		for(int i=2; i<n; i++){
			if(n % i == 0)	System.out.println("Not a Prime Number");
		}
		System.out.println("Prime Number");
	}
}


