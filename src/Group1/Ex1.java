package Group1;


import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        a = s.nextInt();
        int[] mass = new int[5];
        for (int i = 1; i <= mass.length; i++) {
            mass[i] = i;
            mass[a] = a;
            System.out.print(" "+mass[i]);

        }
        if (a>=mass.length){
            System.out.println("  Такого числа в массиве нет");
        }else {
            System.out.println("Результат");

        }

        }

    }

