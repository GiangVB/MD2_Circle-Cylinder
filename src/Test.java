public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        System.out.println(c1.toString());
        Circle c2 = new Cylinder(1.0, 2.5);
        System.out.println(c2.toString());
        Cylinder c3 = new Cylinder(2.0, 1.5);
        System.out.println(c3.toString());
    }
}
