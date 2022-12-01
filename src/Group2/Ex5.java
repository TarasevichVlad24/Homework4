package Group2;

public class Ex5 {
    public static void main(String [] args){
        int[]mas = new int[10];
        for(int i = 0; i<mas.length;i++){
            mas[i]=(int)(Math.random()*10);
            System.out.print(mas[i]+" ");
        }
        System.out.println("");
        for(int i = 0;i<mas.length;i++) {
            if (mas[i] % 2 == 0) mas[i] = 0;
            System.out.print(mas[i]+" ");
        }
    }
}
