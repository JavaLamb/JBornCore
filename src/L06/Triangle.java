package L06;

public class Triangle extends AbstractShape {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Стороны должны быть > 0!");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideC + sideB <= sideA) {
            System.out.println("Такого треугольника не может существовать");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }


    @Override
    double calculateArea() {
        double P = calculatePerimeter() / 2;
        return Math.sqrt((P * (P - sideA) * (P - sideB) * (P - sideC)));
    }

    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    double calculateArea(double sideA, double sideB, int angle) {
        return 0.5 * sideA * sideB * Math.sin(Math.toRadians(angle));
    }


}
