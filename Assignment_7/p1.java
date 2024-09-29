import Shape.Figure;

class p1{

	
	public static void main(String[] args){
		Figure cube = new Figure();
		System.out.println("Cube Volume :"+cube.Volume(5));

		Figure cylinder = new Figure();
		System.out.println("Cylinder Volume :"+cylinder.Volume(6, 7));

		Figure rec = new Figure();
		System.out.println("Rectangular Box Volume:"+rec.Volume(3, 5, 8));
	}
}
