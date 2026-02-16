package L04.Hero;


public enum Circle {
    CIRCLE(2.0,3.0,4.0);

    private final double radius;
    private double y;
    private double x;


    double area() {
        return Math.PI * (radius * radius);
    }

    void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    boolean intersection(Circle another) {
        return distance(another) <= this.radius + another.radius;
    }

    public double distance(Circle another){
        double dx = this.x - another.x;
        double dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


//    private Circle(int radius) {
//        this.radius = radius;
//    }

    private Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
}
