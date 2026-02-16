package L02;

public class T10 {
    void main(){
        System.out.println(word("son of a bitch"));
    }

    String word(String target){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < target.length();i++){
            boolean button = (Character.isLetter(target.charAt(i)));
            if(button){
                sb.append(target.charAt(i));
            }else {
                if(!sb.isEmpty()){
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }
}
