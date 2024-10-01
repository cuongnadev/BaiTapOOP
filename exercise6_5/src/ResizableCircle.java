package exercise6_1.src;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.radius *= (double) percent/100.0;
    }
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }
}
