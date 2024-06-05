package lr1;

import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Фамилия: ");
        String fam = in.nextLine();
        System.out.println("Имя: ");
        String name = in.nextLine();
        System.out.println("Отчество: ");
        String otch = in.nextLine();
        System.out.println("Hello" + " " + fam + " " + name + " " + otch );
        in.close();
    }
}
