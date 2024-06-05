package lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива: ");
        int n = in.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++){
            arr1[i] = random.nextInt(100);
            arr2[i]= random.nextInt(100);
        }
        System.out.println("Массив 1: " + Arrays.toString(arr1)
            + "\nМассив 2: " + Arrays.toString(arr2));
        System.out.println("Одинаковые элементы: " + Arrays.toString(findCommonElement(arr1,arr2)));
    }

    public static int[] findCommonElement(int[] arr1, int[] arr2){
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2)
                .anyMatch(y -> y == x))
                .toArray();
    }
}
