abstract class Animals{
	abstract void makeSound();
	abstract void kidName();

}

class Cats extends Animals{
	void makeSound(){
		System.out.println("Cat meow");
	}

	void kidName(){
		System.out.println("the cat's kid is known");
	}
}

class Dogs extends Animals{
	void makeSound(){
		System.out.println("Dogs bark");
	}

	void kidName(){
		System.out.println("the dog's kid is called a puppy");
	}

}

class p1{
	public static void main(String[] args){
		System.out.println("Cats:");
		Cats c = new Cats();
		c.makeSound();
		c.kidName();

		System.out.println("Dogs:");
		Dogs d = new Dogs();
		d.makeSound();
		d.kidName();
	}
}
