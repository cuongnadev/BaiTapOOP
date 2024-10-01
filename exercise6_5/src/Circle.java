package exercise6_1.src;

public class Circle implements GeometriObject{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString(){
        return "Circle[r = " + this.radius + "]";
    }
}
