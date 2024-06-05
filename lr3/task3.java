package lr3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=1;
        int b=0;
        int c = 0;

        System.out.println("Введите количество символов.");
        int j = in.nextInt();
        for(int i = 0; i < j; i++){
            c= a+b;
            System.out.print(c + " ");
            a = b;
            b = c;


        }
    }
}
