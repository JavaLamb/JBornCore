package L01;

public class T07 {
    void main(){
        int[] array = new int[]{1,4,12,42,13,16,17,7};
        ArraySum(array);
    }

    void ArraySum(int[]array){
        int sum = 0, product = 1;
        for(int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                sum += array[i];
            }else product *=array[i];
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }



}
