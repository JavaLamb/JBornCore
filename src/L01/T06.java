package L01;

import java.util.Scanner;

public class T06 {
    void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифру для таблицы умножения");
        int multiplier = scan.nextInt();
        multiplication(multiplier);
    }

    void multiplication(int multiplier){
        for(int i = 1;i <= 10;i++){
            System.out.println(i + " * " + multiplier + " = " + multiplier*i );
        }
    }

}
