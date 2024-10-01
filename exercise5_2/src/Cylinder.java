public class Cylinder {
    private Circle base;
    private double height;
    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }
    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    // Calculate volume of the cylinder
    public double getVolume() {
        return base.getArea() * height;
    }

    // Calculate the surface area of the cylinder
    public double getSurfaceArea() {
        return 2 * base.getArea() + base.getCircumference() * height;
    }

    // Get the information of the cylinder
    public String toString() {
        return "Cylinder [base=" + base + ", height=" + height + "]";
    }
}