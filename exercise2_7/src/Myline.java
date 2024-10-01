public class Myline {
    MyPoint begin;
    MyPoint end;

    public Myline (int x1, int y1, int x2, int y2){
        begin = new MyPoint();
        end = new MyPoint();
        begin.setX(x1);
        begin.setY(y1);
        end.setX(x2);
        end.setY(y2);
    }
    public Myline(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public int[] getBeginXY (){
        int[] xy = new int[2];
        xy[0] = this.getBeginX();
        xy[1] = this.getBeginY();
        return xy;
    }
    public void setBeginXY (int x, int y){
        begin.setX(x);
        begin.setY(y);
    }
    public int[] getEndXY (){
        int[] xy = new int[2];
        xy[0] = this.getEndX();
        xy[1] = this.getEndY();
        return xy;
    }
    public void setEndXY (int x, int y){
        end.setX(x);
        end.setY(y);
    }

    public double getLength(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }
    public double getGradient(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
    public String toString(){
        return "Myline[begin = (" + getBeginX() + "," + getBeginY() + ")" +
                ",end = (" + getEndX() + "," + getEndY() + ")";
    }

}
