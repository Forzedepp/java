package lr3;

import java.util.Scanner;

public class task1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Введите число от 1 до 7:");
            int number = in.nextInt();
            String dotw;
            switch (number)
            {
                case 1:
                    dotw = "Понедельник";
                    break;
                case 2:
                    dotw = "Вторник";
                    break;
                case 3:
                    dotw = "Среда";
                    break;
                case 4:
                    dotw = "Четверг";
                    break;
                case 5:
                    dotw = "Пятница";
                    break;
                case 6:
                    dotw = "Суббота";
                    break;
                case 7:
                    dotw = "Воскресенье";
                    break;
                default:
                    dotw = "Введите число в указанном диапазоне.";
            }
            System.out.println(dotw + " это " + number + " день недели.");
        }
    }




