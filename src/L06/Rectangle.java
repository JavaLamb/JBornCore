package L06;

public class Rectangle extends AbstractShape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    double calculateArea() {
        return sideA * sideB;
    }
}
