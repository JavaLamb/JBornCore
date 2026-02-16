package L02;

import java.util.Scanner;

public class T01 {
    void main() {
        ShowChars();
    }

    void ShowChars() {
        Scanner scanned = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String Word = scanned.nextLine();
        StringBuilder task = new StringBuilder();
        int repeatCount = 0;
        for (int charNumber = 0; charNumber < Word.length(); charNumber++) {
            if (Word.charAt(charNumber) == ' ') {
                continue;
            }
            repeatCount += 1;
            for (int z = 0; z < repeatCount; z++) {
                task.append(Word.charAt(charNumber));
            }
            System.out.println(task);
            task.setLength(0);
        }
    }
}