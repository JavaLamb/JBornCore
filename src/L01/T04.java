package L01;

public class T04 {
    void main(){
        System.out.println(distance(7,4,2,2));
    }

    double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)));
    }

}
