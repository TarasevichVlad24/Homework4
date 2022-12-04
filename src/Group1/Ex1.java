package Group1;


import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        a = s.nextInt();
        int[] mass = new int[]{2, 6, 7, 5, 4, 4};

        int counter = 0;
        for (int n = 0; n < mass.length; n++) {
            if (mass[n] == a) {
                counter++;
            }
        }
        if(counter==0){
            System.out.println("Число не входит");
        }
        int c = 0;
        int[] mass2 = new int[mass.length - counter];
        for (int n = 0; n < mass.length - counter; n++) {

            if (mass[n] != a) {
                mass2[c] = mass[n];
                c++;
            }
        }

        System.out.printf(Arrays.toString(mass2));


    }

}



