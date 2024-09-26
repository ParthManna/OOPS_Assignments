package Shape;

public class Figure{

	public double Volume(double s){
		return s*s*s;
	}

	public double Volume(double r, double h){
		return Math.PI * (r*r) * h;
	}

	public double Volume(double l, double w, double h){
		return l*w*h;
	}
}
