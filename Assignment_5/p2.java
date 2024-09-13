class Vehicle {
    int w; 
    int s; 

    Vehicle(int w, int s) {
        this.w = w;
        this.s = s;
    }
}

class Car extends Vehicle {
    int n; 

    Car(int n, int w, int s) {
        super(w, s);
        this.n = n;
    }
}

class Truck extends Vehicle {
    int l;

    Truck(int l, int w, int s) {
        super(w, s);
        this.l = l;
    }
}

class p2 {
    public static void main(String[] args) {
        Car c = new Car(5, 4, 80);
        Truck t = new Truck(30, 2, 70);

        System.out.println("Car details:");
        System.out.println("Number of passengers: " + c.n);
        System.out.println("Number of wheels: " + c.w); 
        System.out.println("Speed: " + c.s + " m/s"); 

        System.out.println("Truck details:");
        System.out.println("Load limit: " + t.l);
        System.out.println("Number of wheels: " + t.w); 
        System.out.println("Speed: " + t.s + " m/s"); 
	if(c.s>t.s)	System.out.println("Faster Vehicle is Car");
	else System.out.println("Faster Vehicle is Truck");
    }
}

