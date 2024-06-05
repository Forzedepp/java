package lr2;

import java.util.Scanner;
public class task2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(Math.min(a-b-c, Math.min(a*b-c,a-b*c)));
    }

}
