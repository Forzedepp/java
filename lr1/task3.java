package lr1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String day = in.nextLine();

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите сегодняшнее число: ");
        int number = in.nextInt();

        System.out.println("Сегодня " + day + " " + number + " " + month);
        in.close();

    }
}
