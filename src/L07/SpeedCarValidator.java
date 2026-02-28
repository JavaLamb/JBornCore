package L07;

public class SpeedCarValidator implements Validator<Car> {
    @Override
    public boolean isValid(Car obj) {
        return obj.getSpeed()>=100 && obj.getSpeed() <= 800;
    }
}
