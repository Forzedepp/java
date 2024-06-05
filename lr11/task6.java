package lr11;

import java.util.*;

public class task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        List<Integer> integers = new ArrayList<>();
        System.out.print("Введите число, на которое необходимо делить без остатка: ");
        int number = in.nextInt();

        for(int i = 0; i < 10; i++){
            integers.add(random.nextInt(200));
        }

        System.out.println("Список чисел : " + integers.toString());
        List<Integer> afterDiv = listToDiv(integers, number);
        System.out.println("Список чисел деленных на " + number + ": " + afterDiv.toString());
    }

    public static List<Integer> listToDiv(List<Integer> arr, int number){
        return arr.stream()
                .filter(x -> x % number == 0 )
                .toList();
    }

}
