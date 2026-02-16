package L02;

public class T09 {
    void main() {
        System.out.println(palindrome("ма   дА м"));
    }

    String palindrome(String target) {
        StringBuilder sb = new StringBuilder();
        String clear = target.replaceAll("\\s+", "").toLowerCase();
        sb.append(clear).reverse();
        if (sb.toString().equals(clear)) {
            return target;
        } else return "not palindrome";
    }
}