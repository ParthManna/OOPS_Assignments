interface Vehicle{
	void vehicleType();
}

interface Book{
	void bookType();
}

class MobileBookShopping implements Vehicle, Book{
	public void vehicleType(){
		System.out.println("The vehicle is Car");
	}

	public void bookType(){
		System.out.println("These are all Computer Science and Engineering books");
	}
}

class p4{
	public static void main(String args[]){
		
		MobileBookShopping a = new MobileBookShopping();

		a.vehicleType();
		a.bookType();

	}
}
