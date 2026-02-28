package L07;

public class CarValidator implements Validator<Car> {
    private final WeightCarValidator wcv = new WeightCarValidator();
    private final SpeedCarValidator scv = new SpeedCarValidator();

    @Override
    public boolean isValid(Car obj) {
        return scv.isValid(obj)&& wcv.isValid(obj);
    }
}
