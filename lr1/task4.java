package lr1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Какой сейчас месяц? ");
        String month = in.nextLine();

        System.out.println("Сколько дней в данном месяце? ");
        int days = in.nextInt();

        System.out.println(month + " " + days + " дней.");
        in.close();
    }
}
