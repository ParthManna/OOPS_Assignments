abstract class Shape {
    abstract double calcPerimeter();
    abstract double calcArea();
}

class Circle extends Shape {
    private double radius;
    
    Circle(double radius) { this.radius = radius; }
    
    public double calcPerimeter() { return 2 * Math.PI * radius; }
    
    public double calcArea() { return Math.PI * radius * radius; }
}

class Rectangle extends Shape {
    private double length, breadth;
        
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double calcPerimeter() { return 2 * (length + breadth); }

    public double calcArea() { return length * breadth; }
}

class p2 {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(5, 5);
        
        System.out.println("Circle Perimeter: " + circle.calcPerimeter());
        System.out.println("Circle Area: " + circle.calcArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calcPerimeter());
        System.out.println("Rectangle Area: " + rectangle.calcArea());
    }
}
