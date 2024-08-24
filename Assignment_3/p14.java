import java.util.*;

class p14{
	public static void main(String[] city){
		String temp = null;
		
		for(int i=0; i<city.length; i++){
			for(int j=0; j<city.length; j++){
				if(city[i].compareTo(city[j]) < 0){
					temp = city[i];
					city[i] = city[j];
					city[j] = temp;
				}
			}
		}

		for(int i=0; i<city.length; i++)	System.out.println(city[i] + " ");
	}
}
