package L06;

import java.util.Scanner;

public class Main6 {
    void main() {
        Square sq = new Square(3);
        Triangle tr = new Triangle(3, 5, 3);
        Rectangle re = new Rectangle(3, 5);
        AbstractShape[] shapes = new AbstractShape[]{sq, re, tr};
        System.out.println(shapesArea(shapes));

        AlphabetHandler ah = new AlphabetHandler();
        Lower lh = new Lower();
        LongWordHandler lwh = new LongWordHandler(1, 2);
        Handler[] handlers = new Handler[]{lh, ah, lwh};

        Scanner scan = new Scanner(System.in);
        String test = scan.nextLine();


        System.out.println(handler(handlers, test));

        Handler handler = (str) -> (scan.nextLine() + " pen9is");
        System.out.println(handler.handleMessage(" "));
    }

    static String handler(Handler[] handlers, String string) {
        if (string == null) {
            return null;
        }
        String result = string;
        for (Handler hs : handlers) {
            result = hs.handleMessage(result);
            if (result == null) {
                return null;
            }
        }
        return result;
    }

    static double shapesArea(AbstractShape[] figures) {
        double sum = 0;
        for (AbstractShape s : figures) {
            sum += s.calculateArea();
        }
        return sum;
    }


}
