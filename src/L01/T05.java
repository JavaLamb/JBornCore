package L01;

public class T05 {
    void main() {
        System.out.println(Pythagoras(12, 5, 13));
    }

    String Pythagoras(int a, int b, int c) {
        String result;
        if (a * a + b * b == c * c)
            result = "Пифагорова тройка";
        else if (a * a + b * b == b * b)
            result = "Пифагорова тройка";
        else if (c * c + b * b == a * a)
            result = "Пифагорова тройка";
        else
            result = "Не пифагорова тройка";
        return result;
    }
}
