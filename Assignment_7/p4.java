import shapePack.Parallelepiped;
import shapePack.Cube;
import shapePack.Sphere;

public class p4 {
    public static void main(String[] args) {
        Parallelepiped parallelepiped = new Parallelepiped(3, 4, 5);
        Cube cube = new Cube(3);
        Sphere sphere = new Sphere(4);

        System.out.println("Parallelepiped Volume: " + parallelepiped.calcVolume());
        System.out.println("Parallelepiped Surface Area: " + parallelepiped.calcSurfaceArea());

        System.out.println("Cube Volume: " + cube.calcVolume());
        System.out.println("Cube Surface Area: " + cube.calcSurfaceArea());

        System.out.println("Sphere Volume: " + sphere.calcVolume());
        System.out.println("Sphere Surface Area: " + sphere.calcSurfaceArea());
    }
}
