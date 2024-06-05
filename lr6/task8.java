package lr6;

public class task8 {


    public static float getAverage(int[] numbers){
        int sum=0;
        for (int number : numbers){
            sum += number;
        }
        float avg = sum / numbers.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] numbers= {1,5,1,2,1};
        float avg = getAverage(numbers);
        System.out.println("Среднее значение = " + avg );
    }
}
