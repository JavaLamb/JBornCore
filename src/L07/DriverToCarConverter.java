package L07;

public class DriverToCarConverter implements Converter<Driver, Car> {


    @Override
    public Car converter(Driver driver) {
        return new Car((driver.getAge()*10), (Math.round(driver.getBac()*10000)));
    }
}
