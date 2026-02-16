package L02;

import java.lang.reflect.Array;
import java.util.Scanner;

public class T05 {
    void main() {
        namesake();
    }

    void namesake() {
        System.out.println("Введите первое ФИО целиком, в одну строку: ");
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        System.out.println("Введите второе ФИО целиком, в одну строку: ");
        String second = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        String[] firstArr = first.split(" ");
        String[] secondArr = second.split(" ");
        if (secondArr[1].equalsIgnoreCase(firstArr[1])) {
            System.out.println("Вы ввели двух тезок");
        }
    }
}
