package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        List<Integer> integers = new ArrayList<>();
        System.out.print("Введите число, с которым необходимо сравнивать: ");
        int number = in.nextInt();

        for(int i = 0; i < 10; i++){
            integers.add(random.nextInt(200));
        }

        System.out.println("Список чисел : " + integers.toString());
        List<Integer> moreNumber = moreThanNumber(integers, number);
        System.out.println("Список чисел больше " + number + ": " + moreNumber.toString());
    }

    public static List<Integer> moreThanNumber(List<Integer> arr, int number){
        return arr.stream()
                .filter(x -> x > number )
                .toList();
    }
}
