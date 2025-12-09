package L01;

public class T02 {
    void main(){
        System.out.println(summarized(596));

    }

    int summarized(int a){
        int hundreds = a / 100;
        int tens = (a - (hundreds * 100))/10;
        int unit = a-((tens * 10)+(hundreds*100));
        return hundreds + tens + unit;
    }

}
