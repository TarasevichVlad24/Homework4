package Group1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        a = s.nextInt();

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
        }
        if (a < num.length) {
            System.out.println("Число входит");
        } else {
            System.out.println("Число не входит");
        }
    }
}
