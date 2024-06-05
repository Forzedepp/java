package lr1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Какого вы года рождения? ");
        int year = in.nextInt();

        System.out.println("Какой сейчас год? ");
        int nyear = in.nextInt();

        int diff = nyear - year;
        System.out.printf("Вам сейчас " + diff + " лет.");
        in.close();
    }
}
