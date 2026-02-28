package L07;

public class WeightCarValidator implements Validator<Car>{
    @Override
    public boolean isValid(Car obj) {
        return obj.getWeight() >= 1000;
    }
}
