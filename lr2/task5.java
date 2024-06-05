package lr2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число:");
        int a = in.nextInt();

        System.out.println((a / 1000 % 1000) + " тысяч(-а)");


    }
}
