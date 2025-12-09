package L01;

public class T01 {
    void main(String[] args){
        modulo(2,24,12,13);
    }

    void modulo(int divider,int devisible, int devisible1, int devisible2){
            if (devisible % divider == 0){
                System.out.println(devisible);
            }
            if (devisible1 % divider == 0){
                System.out.println(devisible1);
            }
            if (devisible2 % divider == 0){
                System.out.println(devisible2);
            }
    }


}
