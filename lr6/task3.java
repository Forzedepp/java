package lr6;

public class task3 {



    public static int min(int ...numbers){
        int min = 1000;
        for (int number : numbers){
            if(number < min){
                min = number;
            }
        }
        return min;
    }
    public static int max(int ... numbers){
        int max = 0;
        for (int number : numbers){
            if(number>max){
                max = number;
            }
        }
        return max;
    }
    public static float average(int ... numbers){
        float sum = 0;
        for (int number : numbers){
            sum += number;
        }
        sum = sum / numbers.length;
        return sum;
    }

    public static void main(String[] args) {
        int array[]= {8,3,6,1,54,7,9,1,2};
        System.out.println("Минимальное: "+ min(array));
        System.out.println("Максимальное: "+ max(array));
        System.out.println("Среднее значение: " + average(array));
    }
}
