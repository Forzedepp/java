package lr2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число:");
        int a = in.nextInt();

        if ( a >= 5 && a <= 10)
        {
            System.out.println("Число попадет в диапазон");
        }
        else
        {
            System.out.println("Число не попадает в диапазон");
        }
    }
}
