package L02;

public class T02 {
    void main(){
        System.out.println(RandomPin("07 регистра"));
    }

    String RandomPin(String args){
        StringBuilder RegisterCount =  new StringBuilder();
        for( int i = 0 ; i < args.length() ; i++ ){
            if (Character.isDigit(args.charAt(i))){
                RegisterCount.append(args.charAt(i));
            }
        }
        String StrNum = RegisterCount.toString();
        String pin = "";
        int count = Integer.parseInt(StrNum);
        for (int i = 0 ; i < count ; i++ ){
            int randomNumber = (int)(Math.random()*10);
            if(i==0){
                while(randomNumber == 0){
                    randomNumber = (int)(Math.random()*10);
                }
            }
            pin += randomNumber;
        }
    return pin;
    }
}
