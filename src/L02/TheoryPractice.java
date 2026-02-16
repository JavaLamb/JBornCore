package L02;

public class TheoryPractice {
    void main(){
        String stroka = new String("strochka");
        String str = "tak toje mojno";
        System.out.println(stroka);
        System.out.println(str);
        str = "second try";
        System.out.println(str.charAt(6));
        System.out.println(str.length());
        System.out.println(str + " should be better");
        str.concat("bee");


        int primitive = 10;
        Integer wrapper1 = primitive;
        Integer wrapper = Integer.valueOf(primitive);
        int BackToPrimitive = wrapper.intValue();
    }
}
