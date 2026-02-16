package L02;

public class T07 {
    void main() {
        System.out.println(upperSymb("JBOBbrn", 'b'));
    }

    String upperSymb(String line, char target) {
        line = line.toLowerCase();
        return line.replace(Character.toLowerCase(target), Character.toUpperCase(target));
    }
}