package L07;

public class DriverValidator implements Validator<Driver> {
    @Override
    public boolean isValid(Driver obj) {
        return(obj.getAge() > 18 && obj.getBac() < 0.16);
    }
}
