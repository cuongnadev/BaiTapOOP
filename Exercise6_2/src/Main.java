public class Main {
    public static void main(String[] args) {
        GeometricObject demo1 = new Circle(3);
        System.out.println("Circle Area:" + demo1.getArea());
        System.out.println("Circle Perimeter:" + demo1.getPerimeter());

        GeometricObject demo2 = new Rectangle(4,5);
        System.out.println("Rectangle Area:" + demo2.getArea());
        System.out.println("Rectangle Perimeter:" + demo2.getPerimeter());
    }
}