package lr6;

import java.util.Scanner;

public class task5 {

    public static int PowSum(int n){
        int sum = 0;
        for (int i = 1; i <=n; i++){
            sum += Math.pow(i,2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = in.nextInt();
        int number = PowSum(n);

        System.out.println("Cумма квадратов натуральных чисел = " + number);

    }
}
