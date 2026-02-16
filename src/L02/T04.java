package L02;

public class T04 {
    void main() {
        System.out.println(entryCount("паралелепипед", 'п'));
    }

    public String entryCount(String entry, char target) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < entry.length(); i++) {
            if (entry.charAt(i) != target) {
                sb.append(entry.charAt(i));
            } else {
                count++;
            }
        }
        System.out.println("Количество вхождений: " + count);
        String result = sb.toString();
        return result;
    }
}
