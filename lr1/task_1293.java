package lr1;

import java.util.Scanner;

public class task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество панелей:");
        int N = in.nextInt();
        System.out.print("Введите длинну панели: ");
        int A = in.nextInt();
        System.out.print("Введите ширину панели: ");
        int B = in.nextInt();
        int S = (N * (A * B)) * 2;
        System.out.println(S);
    }
}
