public class Triangle implements Area{
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public Triangle() {
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

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public double calculateArea() {
        double square = 0.0;
        double halfOfPerimeter;
        halfOfPerimeter = (firstSide+secondSide+thirdSide)/2;
        square = Math.sqrt(halfOfPerimeter*(halfOfPerimeter-firstSide)*(halfOfPerimeter-secondSide)*(halfOfPerimeter-thirdSide));
        return square;
    }

    @Override
    public String toString() {
        return "Triangle{" +"firstSide=" + firstSide +", secondSide=" + secondSide +", thirdSide=" + thirdSide +'}';
    }
}
