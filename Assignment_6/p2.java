abstract class Shape{
	abstract double RectangleArea(double length, double breadth);
	abstract double SquareArea(double side);
	abstract double CircleArea(double radius);
}

class Area extends Shape{
	double RectangleArea(double length, double breadth){
		return length * breadth;
	}

	double SquareArea(double side){
		return side *side;
	}

	double CircleArea(double radius){
		return Math.PI * radius * radius;
	}
}

class p2{
	public static void main(String[] args){
		
		Area a = new Area();
		System.out.println("Ractangle Area:"+a.RectangleArea(5, 6));

		System.out.println("Square Area:"+a.SquareArea(4));

		System.out.println("Circle Area:"+a.CircleArea(3));
	}
}
