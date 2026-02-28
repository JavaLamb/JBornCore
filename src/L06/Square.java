package L06;

public class Square extends AbstractShape {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
