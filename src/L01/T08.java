package L01;

import java.util.Scanner;

public class T08 {
    void main(){
        division();
    }

    void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int second = scanner.nextInt();
        if(first % second == 0)
            System.out.println("Частное : " + first/second);
        else System.out.println("Остаток от деления: "+ first % second);
    }

}
