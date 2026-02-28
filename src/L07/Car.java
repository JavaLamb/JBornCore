package L07;

import java.util.Objects;

public class Car {
    private int speed;
    private int weight;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && weight == car.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, weight);
    }

    public Car(int speed, int weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getValue(){return "speed: " + this.speed + "weight: " + this.weight;}

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }
}
