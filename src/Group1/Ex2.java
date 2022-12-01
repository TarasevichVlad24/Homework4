package Group1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("  Введите размер массива");
        a = s.nextInt();
        int[] mass = new int[a];
        int max =0;
        int min = 99;
        int mid;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10);
            if (max <= mass[i]){
                max = mass[i];
            }
            if (min >= mass[i]){
                    min = mass[i];
            }

            System.out.print(mass[i] + " ");
        }

        System.out.println("Максимальное значение:  " + max);
        System.out.println("Минимальное значение:  " + min);
        System.out.println("Среднее значение:  " + (max+=min)/2);

    }

}
