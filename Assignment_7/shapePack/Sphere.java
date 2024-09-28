// File: shapePack/Sphere.java
package shapePack;

public class Sphere implements Shape3D {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcVolume() {
        return (4.0 / 3) * PI * Math.pow(radius, 3);
    }

    @Override
    public double calcSurfaceArea() {
        return 4 * PI * Math.pow(radius, 2);
    }
}
