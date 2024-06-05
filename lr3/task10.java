package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int s = in.nextInt();
        int numbers[] = new int[s];
        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(1000);
        }

        Arrays.sort(numbers);

        for (int j= numbers.length - 1; j>=0; j--){
            System.out.print(numbers[j] + " ");
        }
    }
}
