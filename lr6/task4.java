package lr6;

import java.util.Scanner;

public class task4 {


    public static int fuctorial(int number){
        int fuct = number * (number - 2) * (number - 4);
        return  fuct;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, двойной факториал которого необходимо найти ");
        int number = in.nextInt();
        int fuct = fuctorial(number);
        System.out.println(fuct);
    }
}
