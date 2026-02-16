package L04;

public class UnderstoodRecursion {

    void main() {
//        System.out.println(convertacia("abcd"));
//        printRange(4);
//        System.out.println(canReach(1, 5));
//        System.out.println(doubleChar("cat"));
//        System.out.println(zip("123", "abc"));
        System.out.println(nest(13));
    }


//    String convertacia(String text) {
//        if (text.isBlank()) {
//            return text;
//        }
//        System.out.println("text: " + text + "\tnext conv: " + text.substring(1) + "\tadded symbol: " + text.charAt(0));
//        return convertacia(text.substring(1)) + text.charAt(0);
//    }

//    void printRange(int n) {
//        if (n != 0) {
//            System.out.println(n);
//            printRange(n - 1);
//            System.out.println(n);
//        }
//    }

//    boolean canReach(int start, int target) {
//        if (start == target) {
//            return true;
//        }
//        if (start > target) {
//            return false;
//        }
//        return canReach(start + 2, target) || canReach(start * 3, target);
//    }
//
//    String doubleChar(String s) {
//        if (s.isBlank()) {
//            return "";
//        }
//        System.out.println(s);
//        System.out.println(s.substring(1));
//        return "" + s.charAt(0) + s.charAt(0) + doubleChar(s.substring(1));

    /// /    }
//
//    String zip(String s1, String s2) {
//        if (s1.isEmpty()) {
//            return s2;
//        } else if (s2.isEmpty()) {
//            return s1;
//        }
//        return "" + s1.charAt(0) + s2.charAt(0) + zip(s1.substring(1), s2.substring(1));
//    }

    String nest(int n) {

        return (n <= 0) ? "" : "(" + nest(n - 1) + ")";
    }

}

