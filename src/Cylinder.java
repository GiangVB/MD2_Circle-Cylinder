public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSurfaceArea() {
        return super.getArea() * 2 + 2 * Math.PI * super.getRadius() * height;
    }

    public double getVolume() {
        return 2 * super.getRadius() * super.getRadius() * height;
    }

    @Override
    public String toString() {
        return "A cylinder with radius = "
                + super.getRadius()
                + ", height = "
                + getHeight()
                + ", surface area = "
                + getSurfaceArea()
                + ", volume = "
                + getVolume();
    }
}
