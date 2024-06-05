package lr6;

public class task9 {
    public static char[] arraySort(char[] numbers) {
       int j = numbers.length - 1;
        for (int i = 0; i < j; i++) {
                char tmp = numbers[i];
                numbers[i]= numbers[j];
                numbers[j] = tmp;
                j--;
        }
        return numbers;
    }

    public static void main(String[] args) {
        char[] numbers= {'c','d','b','e'};
        char[] afterSort = arraySort(numbers);
        for (int i = 0; i < afterSort.length; i++){
            System.out.print(afterSort[i]+ " ");

        }
    }
}

