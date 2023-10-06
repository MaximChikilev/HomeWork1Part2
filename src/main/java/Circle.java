public class Circle implements Area{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2.0);
    }

    @Override
    public String toString() {
        return "Circle{" +"radius=" + radius +'}';
    }
}
