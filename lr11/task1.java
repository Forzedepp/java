package lr11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int n = in.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        System.out.print("\nВведите числа в массив: ");
        for (int i = 0; i< n; i++){
            array.add(i, in.nextInt());
        }

        ArrayList<Integer> evenArray =  getEvenNumbers(array);
        System.out.println(evenArray);

        int[] arr = new int[n];

        for (int i = 0; i< n; i++){
            arr[i] = random.nextInt();
        }

        System.out.println("Массив до фильтрации: " + Arrays.toString(arr));
        System.out.println("Массив после фильтрации: " + Arrays.toString(filterEvenArray(arr)));
    }

    public static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> array){
        ArrayList<Integer> evenArray = new ArrayList<>();

        for(int i = 0; i< array.size();i++){
            if(array.get(i) % 2 == 0){
                evenArray.add(array.get(i));
            }
        }
        return evenArray;
    }

    public static int[] filterEvenArray(int[] arr){
        return Arrays.stream(arr).filter( x -> x % 2 == 0).toArray();
    }



}
