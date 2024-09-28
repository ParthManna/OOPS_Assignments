package shapePack;

import shapePack.Shape3D;

public class Parallelepiped implements Shape3D {
    double length, width, height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calcVolume() {
        return length * width * height;
    }

    
    public double calcSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
}
