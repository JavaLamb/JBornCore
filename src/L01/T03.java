package L01;

import java.util.Scanner;

public class T03 {
    void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите стороны четырехугольника");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        check(a,b,c,d);
    }

    void check(int a,int b,int c,int d){
        if(a == b && b == c && c == d) {
            System.out.println("Квадрат");
        }else System.out.println("Прямоугольник");
    }

}
