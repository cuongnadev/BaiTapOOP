public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint();
        v2 = new MyPoint();
        v3 = new MyPoint();
        v1.setX(x1);
        v1.setY(y1);
        v2.setX(x2);
        v2.setY(y2);
        v3.setX(x3);
        v3.setY(y3);
    }
    public String toString(){
        return "MytTriangle[v1=(" + v1.getX() + "," + v1.getY() + ")"+
                ",v2=(" + v2.getX() + "," + v2.getY() + ")" +
                ",v3=(" + v3.getX() + "," + v3.getY() + ")]";
    }

    public double getPerimeter(){
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
        return a + b + c;
    }

    public String getType(){
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
        if(a == b && b == c){
            return "Equilateral";
        }else if (a == b || b == c || c == a){
            return "Isosceles";
        }else{
            return "Scalene";
        }
    }
}
