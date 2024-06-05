package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte[] array = new byte[3];

        try{
            byte sum = 0;

            System.out.println("Введите значение ");

            for (int i = 0; i < array.length; i++){
                array[i]=in.nextByte();
                sum += array[i];
            }
            System.out.println("Сумма введеных чисел: " + sum);
        }catch (InputMismatchException e){
            System.out.println("Вы ввели значение не byte типа");
        }
    }
}
