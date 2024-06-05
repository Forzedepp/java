package lr3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели с большой буквы.");
        String dotw = in.nextLine();
        int day = 0;
        switch (dotw) {
            case "Понедельник":
                day = 1;
                break;
            case "Вторник":
                day = 2;
                break;
            case "Среда":
                day = 3;
                break;
            case "Четверг":
                day = 4;
                break;
            case "Пятница":
                day = 5;
                break;
            case "Суббота":
                day = 6;
                break;
            case "Воскресенье":
                day = 7;
                break;
            default:
                System.out.println("Введите правильное название дня недели.");
                return;
        }
        System.out.println(dotw + " это " + day + " день недели.");
    }
}
