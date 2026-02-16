package L02;

public class T08 {
    void main() {
        System.out.println(subString("Biba", "aaa"));
    }

    String subString(String first, String second) {
        StringBuilder sb = new StringBuilder();
        if (!first.contains(second)) {
            sb.append(second);
            sb.append(first);
            first = sb.toString();
        }
        return first;
    }

}
