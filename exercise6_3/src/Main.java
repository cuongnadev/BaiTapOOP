public class Main {
    public static void main(String[] args) {
        Movable demo1 = new MovablePoint(2, 3, 4, 5);

        System.out.println(demo1.toString());
        System.out.println("after moveUp");
        demo1.moveUp();
        System.out.println(demo1.toString());

        System.out.println("after moveDown");
        demo1.moveDown();
        System.out.println(demo1.toString());

        System.out.println("after moveLeft");
        demo1.moveLeft();
        System.out.println(demo1.toString());

        System.out.println("after moveRight");
        demo1.moveRight();
        System.out.println(demo1.toString());
    }
}