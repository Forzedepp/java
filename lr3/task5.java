package lr3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какое количество для чисел будет для суммы?");
        int j = in.nextInt();
        int i = 0;
        int sum = 0;
        int numbers[] = new int[j];
        while (i < j){
            System.out.println("Введите число:");
            int num = in.nextInt();
            if((num % 5 == 2) || (num % 3 == 1) ) {
                numbers[i] = num;
                sum += num;
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
        System.out.println("\nСумма равна: " + sum);
    }
}
