package shapePack;

public class Cube implements Shape3D {
    double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calcVolume() {
        return Math.pow(side, 3);
    }

    public double calcSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}
