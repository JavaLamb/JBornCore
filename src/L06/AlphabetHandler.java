package L06;

public class AlphabetHandler implements Handler {
    @Override
    public String handleMessage(String message) {
        if (message == null) {
            return null;
        }
        for (int i = 0; i < message.length(); i++) {
            if (!Character.isLetter(message.charAt(i)) && message.charAt(i) != ' ') {
                return null;
            }
        }
        if (!message.matches("[А-ЯA-Za-zа-я ]*")) {
            return null;
        }
        return message;
    }
}
