public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        double v = Math.PI * Math.pow(getRadius(),2)* height;
        return v;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + ", Subclass of " + super.toString();
    }
}
