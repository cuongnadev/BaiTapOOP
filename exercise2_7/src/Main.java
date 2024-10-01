public class Main {
    public static void main(String[] args) {
        MyPoint Begin = new MyPoint(3,0);
        MyPoint End = new MyPoint(0, 4);
        Myline myline1 = new Myline(Begin, End);
        Myline myline2 = new Myline(3, 0, 4, 0);

        System.out.println(myline1.toString());
        System.out.println(myline2.toString());
    }
}