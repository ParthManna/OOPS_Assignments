class Vehicle {
    protected String regNo;
    protected String companyName;
    protected double price;

    void getData(String regNo, String companyName, double price) {
        this.regNo = regNo;
        this.companyName = companyName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Registration No: " + regNo);
        System.out.println("Company Name: " + companyName);
        System.out.println("Price: $" + price);
    }
}

class LightMotorVehicle extends Vehicle {
    private double mileage;

    void getData(String regNo, String companyName, double price, double mileage) {
        super.getData(regNo, companyName, price);
        this.mileage = mileage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

class HeavyMotorVehicle extends Vehicle {
    private double capacity;

    void getData(String regNo, String companyName, double price, double capacity) {
        super.getData(regNo, companyName, price);
        this.capacity = capacity;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity: " + capacity + " tons");
    }
}

public class p3 {
    public static void main(String[] args) {

        LightMotorVehicle lightVehicle = new LightMotorVehicle();
        lightVehicle.getData("936NFJ", "TATA", 50000, 18.7);
        System.out.println("Light Motor Vehicle Details:");
        lightVehicle.displayDetails();
        System.out.println();

        HeavyMotorVehicle heavyVehicle = new HeavyMotorVehicle();
        heavyVehicle.getData("894AHE", "Volvo", 90000, 15.0);
        System.out.println("Heavy Motor Vehicle Details:");
        heavyVehicle.displayDetails();
    }
}
