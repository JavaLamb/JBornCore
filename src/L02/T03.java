package L02;

import java.util.Scanner;

public class T03 {
    void main() {
        rectangle();
    }

    void rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер первой стороны: ");
        int SideHoriz = scan.nextInt();
        System.out.println("Введите размер второй стороны: ");
        int SideVert = scan.nextInt();
        int S = SideHoriz * SideVert;
        int P = 2 * (SideHoriz + SideVert);
        StringBuilder horizontal = new StringBuilder();
        StringBuilder vertical = new StringBuilder();
        for (int i = 0; i < SideHoriz; i++) {
            horizontal.append("-");
        }
        System.out.println(horizontal);
        for (int z = 0; z < SideVert - 2; z++) {
            vertical.append("+");
            for (int x = 0; x < SideHoriz - 2; x++) {
                vertical.append(" ");
                if (x == (SideHoriz - 3)) {
                    if (z == SideVert - 3) {
                        vertical.append("+");
                    } else {
                        vertical.append("+\n");

                    }
                }
            }

        }
        System.out.println(vertical);
        System.out.println(horizontal);
    }
}
