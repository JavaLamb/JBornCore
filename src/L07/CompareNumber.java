package L07;

public class CompareNumber {
    <T extends Number> int Compare(T first, T second) {
        double f = first.doubleValue();
        double s = second.doubleValue();

        if (f > s) {
            return 1;
        } else if (f < s) {
            return -1;
        } else return 0;
    }
}
