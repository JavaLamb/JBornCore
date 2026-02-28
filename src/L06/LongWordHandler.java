package L06;

import java.sql.Array;

public class LongWordHandler implements Handler {
    int m;
    int n;

    public LongWordHandler(int m, int n) {
        this.m = m;
        this.n = n;
    }

    @Override
    public String handleMessage(String message) {
        if (message == null) {
            return null;
        }
        int count = 0;
        String[] words = message.split("\\s+");
        for (String word : words) {
            if(word.length() >= n){
                count++;
            }
        }
        if (count >= m){
            return message;
        }
        return null;
    }
}
