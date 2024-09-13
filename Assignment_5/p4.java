
class CountObj{
	static int count=0;
	
	CountObj(){
		count++;
	}

	static void display(){
		System.out.println("Total Number of Objects Create :"+count);
	}
}

class p4{
	public static void main(String[] args){
		CountObj ob1 = new CountObj();
		CountObj ob2 = new CountObj();
		CountObj ob3 = new CountObj();
		CountObj ob4 = new CountObj();

		CountObj.display();
	}
}
