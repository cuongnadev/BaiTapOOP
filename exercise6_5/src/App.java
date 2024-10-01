package exercise6_1.src;
public class App {
    public static void main(String[] args) throws Exception {
        Circle c1 = new Circle(4);
        System.out.println("Diện tích: " + c1.getArea());
        System.out.println("Chu Vi:" + c1.getPerimeter());
        System.out.println(c1.toString());

        System.out.println("---Sau khi resize---");

        ResizableCircle resizableCircle = new ResizableCircle(4);
        resizableCircle.resize(50);
        System.out.println("Diện tích: " + resizableCircle.getArea());
        System.out.println("Chu Vi:" + resizableCircle.getPerimeter());
        System.out.println(resizableCircle.toString());
        System.out.println("radius sau khi resize là: " + resizableCircle.radius);
    }
}
