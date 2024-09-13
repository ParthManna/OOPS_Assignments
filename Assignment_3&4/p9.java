import java.util.Scanner;

class p9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row and column:");
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		int a[][] = new int[r][c];
		System.out.println("Enter Matrix:");
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)	a[i][j] = sc.nextInt();
		
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++){
				if(a[i][j] % 2 !=0)	sum = sum + a[i][j];
			}
		System.out.println("Sum of Odd number : "+sum);
	}
}
