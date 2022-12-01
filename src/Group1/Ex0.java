package Group1;

import java.util.Scanner;

public class Ex0 {
    public static void main(String[] args) {
        int a;
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        a = s.nextInt();

        int[] num = new int[]{1, 3, 4, 5, 8, 11, 14};
        for (int i = 0; i < num.length; i++) {

            if (a == num[i]) {
                count++;
            } else {

            }
        }
        if (count > 0) {
            System.out.println("Число входит");
        } else {
            System.out.println("Число не входит");
        }
    }
}
