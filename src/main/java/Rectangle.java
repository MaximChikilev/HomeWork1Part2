public class Rectangle implements Area {
    private  double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Rectangle() {
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide*secondSide;
    }

    @Override
    public String toString() {
        return "Rectangle{" +"firstSide=" + firstSide +", secondSide=" + secondSide +'}';
    }
}
