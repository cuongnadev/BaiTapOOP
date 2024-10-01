public class MyCircle {
    MyPoint center ;
    private int radius = 1;

    public MyCircle() {
        center = new MyPoint();
    }

    public MyCircle (int x, int y, int radius){
        center = new MyPoint();
        center.setX(x);
        center.setY(y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public int[] getCenterXY(){
        int[] xy = new int[2];
        xy[0] = getCenterX();
        xy[1] = getCenterY();
        return xy;
    }

    public void setCenterXY (int x, int y){
        setCenterX(x);
        setCenterY(y);
    }

    public String toString(){
        return "MyCircle[radius = " + radius + ", center = (" + getCenterX() + "," + getCenterY() + ")]";
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
}
