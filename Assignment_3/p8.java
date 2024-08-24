import java.util.Scanner;

class p8{
	static int r,c;
	static Scanner sc = new Scanner(System.in);

	public static void CreateMatrix(int a[][]){
        for(int i=0; i<r; i++)
        	for(int j=0; j<c; j++)  a[i][j]=sc.nextInt();
	}

	public static void DisplayMatrix(int a[][]){
		for(int i=0; i<r; i++){
            for(int j=0; j<c; j++)  System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}

	public static void main(String[] args){
		System.out.print("Enter Row and column:");
		r = sc.nextInt();
		c = sc.nextInt();

		int n1[][] = new int[r][c];
		int n2[][] = new int[r][c];
		int sum[][] = new int[r][c];

		System.out.println("Enter First Matrix:");
		CreateMatrix(n1);

		System.out.println("Enter Second Matrix:");
		CreateMatrix(n2);

		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)	sum[i][j] = n1[i][j] + n2[i][j];
		
		System.out.println("Sum of Matrix:");
		DisplayMatrix(sum);
	}
}