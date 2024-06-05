package lr1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Имя: ");
        String name = in.nextLine();

        System.out.println("Возраст: ");
        int age = in.nextInt();

        System.out.println( name + " " + age + " лет");

    }
}
