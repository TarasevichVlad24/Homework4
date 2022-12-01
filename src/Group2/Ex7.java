package Group2;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args){
        int[] mas = new int[]{1,18,4,88,67};
        System.out.print("Начальный массив: " + Arrays.toString(mas));
        System.out.println("");

        boolean isSort = false;
        int a;
        while(!isSort){
            isSort = true;
            for (int i = 0; i<mas.length-1;i++){
                if(mas[i]>mas[i+1]){
                    isSort = false;

                    a = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = a;
                }
            }
        }
        System.out.print("Отсортированный массив" + Arrays.toString(mas));
    }
}
