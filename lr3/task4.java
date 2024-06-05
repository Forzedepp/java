package lr3;

import java.util.Scanner;


public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        System.out.println("Для того чтобы вывести только минимальное и максимальное число, введите 1, для вывода последовательности числе от минимального до максимального введите 2, для выхода нажмите любой знак.");
        int number = in.nextInt();
        switch (number){
            case 1:
                System.out.println("Минимальное: " + Math.min(a,b) + " Максимальное: "+ Math.max(a,b));
                break;
            case 2:
                for (int i = min; i<=max; i++ ){
                    System.out.print(i+ " ");
                }
                break;
            default:
                System.out.println("Выход.");
                break;

        }



    }
}
