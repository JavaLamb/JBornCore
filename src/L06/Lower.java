package L06;

public class Lower implements Handler {
    @Override
    public String handleMessage(String message) {
        if (message == null) {
            return null;
        }
        return message.toLowerCase().trim();
    }
}
