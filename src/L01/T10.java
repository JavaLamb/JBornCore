package L01;

public class T10 {
    void main(){

    SCircumference(2.2);

    }


    void SCircumference(double radius){
        double S = Math.PI * Math.pow(radius, 2);
        double Circumference = Math.PI * 2 * radius;
        System.out.println("S= " + S + " Circumference= " + Circumference);
    }
}
