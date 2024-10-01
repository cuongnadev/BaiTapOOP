

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        int[] get = new int[]{getX(), getY()};
        return get;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public double distance(Point another) {
        int deltaX = getX() - another.getX();
        int deltaY = getY() - another.getY();
        return Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));
    }
}
