package Group2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int n = 0;
        int nums = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число n удовлетворяющее 5<n<=10");
        n = s.nextInt();

        while (n>5) {
            if (s.hasNextInt()) {
                n = s.nextInt();
                if (n < 5) {
                    System.out.println("Введенное число неверно  ");
                    s.next();
                }
            } else {
                System.out.println("Ошибка  ");
            }
            int[] mas1 = new int[n];
            for (int i = 0; i < mas1.length; i++) {
                mas1[i] = (int) (Math.random() * (n + 1));
                System.out.print(mas1[i]+" ");
                if (mas1[i] % 2 == 0&mas1[i]!=0)nums++;
            }
            System.out.println(" ");

        }
    }
}