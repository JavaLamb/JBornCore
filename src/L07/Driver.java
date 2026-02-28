package L07;

import java.util.Objects;

public class Driver {
    private int age;
    private float bac;

    public void setAge(int age) {
        this.age = age;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public float getBac() {
        return bac;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return age == driver.age && bac == driver.bac;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, bac);
    }

    public int getAge() {
        return age;
    }
    public String getValue(){return "age: " + this.age + "bac: " + this.bac;}

    public Driver(int age, float bac) {
        this.age = age;
        this.bac = bac;
    }
}
