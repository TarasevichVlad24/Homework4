package Group1;

public class Ex3 {
    public static void main(String[] args){
        double summas1 = 0;
        double summas2 = 0;
        int[] mas1 = new int [5];
        int[] mas2 = new int [5];
        for (int i = 0; i<mas1.length; i++){
            mas1[i] = (int)(Math.random()*6);
            System.out.print(mas1[i] + " ");
            summas1 += (double)mas1[i]/mas1.length;
        }
        System.out.println("  ");
        for (int i = 0; i<mas2.length;i++){
            mas2[i] = (int)(Math.random()*6);
            System.out.print(mas2[i] + " ");
            summas2 += (double)mas2[i]/mas2.length;
        }
        System.out.println(" ");
        System.out.println("Среднее арифметическое первого массива  " + summas1);
        System.out.println("Среднее арифметическое второго массива  " + summas2);
        if (summas1 == summas2){
            System.out.print("Средние арифметические двух массивов равны");
        } else if (summas1>summas2){
            System.out.println("Среднее арифметическое первого массива больше");
        }else {
            System.out.println("Среднее арифметическое второго массива больше");
        }
    }
}
