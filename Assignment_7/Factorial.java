package Factorial;

public class Factorial{
        public void testF(int n){
                int f=1;
                for(int i=2; i<=n; i++){
                        f *= i;
                }
                System.out.println("Factorial Number:"+f);
        }
}
