public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2.0,"Blue");
        System.out.println(c);
        System.out.println(c.getArea());

        Cylinder c1 = new Cylinder(3.0,"Pink",7.0);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getVolume());
    }
}
