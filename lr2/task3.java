package lr2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число:");
        int a = in.nextInt();

        if ( a % 4 == 0 && a >= 10)
        {
            System.out.println("Число подходит");
        }
        else
        {
            System.out.println("Число не подходит");
        }
    }
}
