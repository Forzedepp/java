package lr3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите количество символов в массиве");
        int j = in.nextInt();
        int i = 0;
        int numbers[] = new int[j];
        while (i < j){
            System.out.println("Введите число:");
            int num = in.nextInt();
            if(num % 5 == 2 ) {
                numbers[i] = num;
                i++;
            }
            else{
                System.out.println("Введите правильное число");
            }

        }
        System.out.print("Введенные числа: ");
        for (i = 0; i<j;i++){
            System.out.print(numbers[i]+ " ");
        }
    }
}
