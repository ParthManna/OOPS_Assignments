class Fuel{
	static float ratePatrol=20,rateDiesel=10;

	Fuel(){
		ratePatrol += ratePatrol * 0.1f;
		rateDiesel += rateDiesel * 0.1f;
	}

	static void display(){
		System.out.println("Fuel price:"+ratePatrol);
		System.out.println("Diesel price:"+rateDiesel);
	}

}
class p5{
	public static void main(String args[]){
	
		Fuel.display();
		Fuel f1 = new Fuel();
		f1.display();
		Fuel f2 = new Fuel();
		f2.display();
		Fuel f3 = new Fuel();
		f3.display();
	}
}
