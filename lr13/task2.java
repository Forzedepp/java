package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = {{5,2,1}, {4,5,6}};
        try{


        System.out.println("Введите индекс стобца ");
        int index = in.nextInt();

        for(int i = 0; i < array.length;i++){
            System.out.println(array[i][index]);
        }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Нет столбца с таким номером");
        }catch (InputMismatchException e){
            System.out.println("Вы ввели не целочисленное число");
        }
    }
}
