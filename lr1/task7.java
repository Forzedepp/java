package lr1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Сколько вам лет? ");
        int age = in.nextInt();

        int year = 2023 - age;

        System.out.println("Вы " + year + " года рождения.");
        in.close();
    }
}
