package L07;

public class Main7 {
    static void main(String[] args) {
        Car car = new Car(14,2500);
        Car car1 = new Car(150,3900);
        Car car2 = new Car(150,500);
        Car car3 = new Car(60,1300);
        Car car4 = new Car(150,800);
        CarValidator cv = new CarValidator();
        DriverValidator dv = new DriverValidator();
        System.out.println(cv.isValid(car));
        System.out.println(cv.isValid(car1));
        System.out.println(cv.isValid(car2));
        System.out.println(cv.isValid(car3));
        System.out.println(cv.isValid(car4));

        Driver driver = new Driver(19,0.12f);
        Driver driver1 = new Driver(17,0.12f);
        Driver driver2 = new Driver(19,0.18f);

        System.out.println(dv.isValid(driver));
        System.out.println(dv.isValid(driver1));
        System.out.println(dv.isValid(driver2));

        float f = 3.45f;
        int i = 6;
        double d = 3.123;
        CompareNumber cn = new CompareNumber();
        System.out.println(cn.Compare(f, d));

        Validator<Car> SpeedCarValidator = (Car obj) -> obj.getSpeed() > 100 && obj.getSpeed()<800 ;
        System.out.println(" ghjdthrf " +SpeedCarValidator.isValid(car));

        Converter<Car, Driver> CarToDriverConverter = (Car in) -> new Driver(in.getWeight()/100,in.getSpeed()/1000f);

        Driver driver00 = CarToDriverConverter.converter(car);

        System.out.println(driver00.getValue());
        Validator<Driver> DriverValidator = (Driver obj) -> obj.getAge() > 18 && obj.getBac() <0.16;

        System.out.println(DriverValidator.isValid(driver00));

    }
}
