package L01;

import java.util.Scanner;

public class T09 {
    void main(){
        converter();
    }

    void converter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой тип конвертера вам нужен?" +
                "1. Градусы Цельсия ó Градусы Фаренгейта.\n" +
                "2. Сантиметры ó Дюймы.\n" +
                "3. Километры ó Мили (морские).\n" +
                "4. Верста ó Аршин\n" +
                "5. Килограммы ó Фунты.\n" +
                "6. Литры ó Галлоны");
        int type = scanner.nextInt();
        float a;
        if(type != 0 && type <= 6){
            switch (type){
                case (1):
                    System.out.println("Введите цельсии: ");
                    a = scanner.nextInt();
                    System.out.println("Это " + ((a * 1.8) + 32) + " в фаренгейтах");
                    break;
                case (2):
                    System.out.println("Введите сантиметры: ");
                    a = scanner.nextInt();
                    System.out.println("Это " + (a / 2.54) + " в дюймах");
                    break;
                case (3):
                    System.out.println("Введите километры: ");
                    a = scanner.nextInt();
                    System.out.println("Это " + (a * 0.621371) + " в милях");
                    break;
                case (4):
                    System.out.println("Введите версты: ");
                    a = scanner.nextInt();
                    System.out.println("Это " + (a * 1500) + " в аршинах");
                    break;
                case (5):
                    System.out.println("Введите килограммы: ");
                    a = scanner.nextInt();
                    System.out.println("Это " + (a * 2.2046) + " в фунтах");
                    break;
                case (6):
                    System.out.println("Введите литры: ");
                    a = scanner.nextFloat();
                    System.out.println("Это " + (a *  0.264172051) + " в галлонах");
                    break;
            }
        }else System.out.println("Нет такого номера конвертера");


    }

}
