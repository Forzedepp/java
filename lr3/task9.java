package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int s = in.nextInt();
        int numbers[] = new int[s];
        Random r = new Random();
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(1000);
        }

        int min= numbers[0];
        for (int i = 0; i < numbers.length; i++) {
        if (min > numbers[i]) {
            min = numbers[i];
            index = i;}
        }

        for (int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Минимальное число="+min+" его индекс="+ index);
    }
}
