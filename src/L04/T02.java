package L04;

public class T02 {
    void main() {
        System.out.println(fibonacci(15));
    }

    int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        int num1 = fibonacci(n-1);
        int num2 = fibonacci(n-2);
        return num1 + num2;
    }

}
