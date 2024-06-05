package lr4;

import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a = rnd.nextInt(2,10);
        int b = rnd.nextInt(2,10);
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = rnd.nextInt(100);
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int c = rnd.nextInt(a);
        int d = rnd.nextInt(b);
        int ar[][]= new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i==c || j==d){
                    ar[i][j]=0;
                }
                else {
                    ar[i][j] = arr[i][j];
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
