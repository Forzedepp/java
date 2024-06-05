package lr1;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число:");
        int number = in.nextInt();

        System.out.println((number - 1) + " " + number + " " + (number + 1) + " " + (number * number));
        in.close();

    }
}
