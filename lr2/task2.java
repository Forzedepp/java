package lr2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число:");
        int a = in.nextInt();

        if ( a % 5 == 2 && a % 7 == 1)
        {
            System.out.println("Число удовлетворяет критериям");
        }
        else
        {
            System.out.println("Число не удовлетворяет критериям");
        }
    }
}
