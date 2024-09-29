package shapePack;

public class Sphere implements Shape3D {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }


    public double calcVolume() {
        return (4.0 / 3) * PI * Math.pow(radius, 3);
    }


    public double calcSurfaceArea() {
        return 4 * PI * Math.pow(radius, 2);
    }
}
