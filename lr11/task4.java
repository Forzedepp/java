package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        List<Integer> integers = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            integers.add(random.nextInt(200));
        }

        System.out.println("Список чисел : " + integers.toString());
        List<Integer> afterSquare = squareList(integers);
        System.out.println("Список квадратов чисел " + afterSquare.toString());
    }

    public static List<Integer> squareList(List<Integer> arr){
        return arr.stream()
                .map(x -> x * x )
                .collect(Collectors.toList());
    }
}
