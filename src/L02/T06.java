package L02;

public class T06 {
    void main() {
        System.out.println(rearrange("   "));
    }

    String rearrange(String obj) {
        StringBuilder sb = new StringBuilder();
        if (obj.isBlank()){
            return obj;
        }
        if (obj.length() % 2 == 0) {
            String firstHalf = obj.substring(0,obj.length()/2);
            String secondHalf = obj.substring(obj.length()/2, obj.length());
            sb.append(secondHalf);
            sb.append(firstHalf);

//            for (int i = (obj.length() / 2); i < obj.length(); i++) {
//                sb.append(obj.charAt(i));
//            }
//            for (int z = 0; z < obj.length() / 2; z++) {
//                sb.append(obj.charAt(z));
//            }
        }else{
            sb.append("Слово состоит из нечетного числа букв");
        }
        return sb.toString();
    }
}
