package lr4;

import java.util.Random;
public class task5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a = 5;
        int b = 3;
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
        int[][] tmp = new int[b][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                tmp[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(tmp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
