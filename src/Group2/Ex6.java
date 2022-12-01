package Group2;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Vlad";
        names[1] = "Artyom";
        names[2] = "Nikolay";
        names[3] = "Fyodor";
        names[4] = "Mikhail";
        Arrays.sort(names);
        System.out.print("  " + Arrays.toString(names));
        }
    }

