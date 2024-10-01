public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {}
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY (){
        int[] xy = new int[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    public void setXY (int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public double distance (int x, int y){
        int xdelta = this.x - x;
        int ydelta = this.y - y;

        return Math.sqrt((xdelta * xdelta) + (ydelta * ydelta));
    }
    public double distance (MyPoint another){
        int xdelta = this.x - another.getX();
        int ydelta = this.y - another.getY();

        return Math.sqrt((xdelta * xdelta) + (ydelta * ydelta));
    }

    public double distance (){
        return Math.sqrt((x * x) + (y * y));
    }

}

