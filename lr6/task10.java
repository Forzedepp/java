package lr6;

public class task10 {
    public static int[] minMaxArray(int ... numbers) {
        int min = 1000;
        int max = 0;

        for (int number : numbers){
            if(number <min){
                min = number;
            } else if (number > max) {
                max = number;
            }
        }
        int[] array = new int[2];
        array[0] = min;
        array[1] = max;
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = {2,5,7,8,1,3,5,9};
        int[] array = minMaxArray(numbers);
        for (int i = 0; i < array.length; i++){
            System.out.println("Минимальное число: " +array[i]);
            i++;
            System.out.println("Максимальное число: " +array[i]);
        }
    }
}
