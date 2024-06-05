package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
        System.out.print("Введите размер массива: ");
        int arrayLength = in.nextInt();
        if (arrayLength < 0){
            throw new NegativeArraySizeException("\tПоложительные элементы отсутствуют.");
        }
        int array[] = new int[arrayLength];
        int sum = 0;

            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
                sum+=array[i];
            }
        int avg = sum/array.length;
        System.out.println("Среднее значение: " + avg);
        }catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: " + e);
        }catch (InputMismatchException e){
            System.out.println("Ошибка: Вы ввели строку, либо число не подходящее под тип integer");
        }catch (ClassCastException e){
            System.out.println("Неверный тип данных");
        }
    }
}
