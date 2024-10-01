public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.0, 5.0, "blue");
        System.out.println("Cylinder information:");
        System.out.println(cylinder.toString());
        System.out.println("Radius: " + cylinder.getBase().getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Surface Area: " + cylinder.getSurfaceArea());
        cylinder.getBase().setRadius(4.0);
        cylinder.setHeight(6.0);
        System.out.println("Updated Cylinder information:");
        System.out.println(cylinder.toString());
        System.out.println("Updated Volume: " + cylinder.getVolume());
        System.out.println("Updated Surface Area: " + cylinder.getSurfaceArea());
    }
}