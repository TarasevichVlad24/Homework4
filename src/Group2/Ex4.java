package Group2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int n = 0;
        int a;
        int j = 0;
        do {
            System.out.print("Введите число n исходя из условия 5<n<=10    ");
            Scanner s = new Scanner(System.in);
            if(s.hasNextInt()){
                n = s.nextInt();
                if(n>5 && n<=10){
                    int[] mas1 = new int[n];
                    for(int i = 0; i<mas1.length;i++){
                        mas1[i] = (int)(Math.random()*(n+1));
                        System.out.print(mas1[i]+" ");
                        if(mas1[i]%2==0){
                            j++;
                        }
                    }
                    System.out.println();
                    System.out.println("Оставляем только четные числа  ");
                    if(j!=0){
                        int[] mas2 = new int[j];
                        j=0;
                        for(int i = 0; i<mas1.length;i++){
                            if(mas1[i]%2==0){
                                mas2[j] = mas1[i];
                                System.out.print(mas2[j]+" ");
                                j++;
                            }
                        }
                    }else{
                        System.out.println("Четных чисел нет");
                    }
                }
            }
        }while(n<5 && n>=10);
    }
}