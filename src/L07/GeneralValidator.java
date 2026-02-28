package L07;

public class GeneralValidator implements Validator{
    @Override
    public boolean isValid(Object obj) {
        return switch (obj) {
            case Car car -> car.getWeight() >= 1000 && car.getSpeed() >= 100;
            case Driver driver -> driver.getAge() > 18 && driver.getBac() < 0.16;
            default -> false;
        };
    }
}
