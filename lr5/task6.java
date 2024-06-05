package lr5;

import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class task6 {
    private int min,max;

    public void getMinMax(int min, int max){
        if (min <= max){
            this.min = min;
            this.max = max;
        }
        else{
            this.min= max;
            this.max= min;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите минимальное число: ");
        int min = in.nextInt();
        System.out.println("Введите максимальное число: ");
        int max = in.nextInt();
        task6 MinMax= new task6(min,max);
        System.out.println("Минимальное число: " + MinMax.min + " Максимальное число: "+ MinMax.max);
    }
    public task6(int min, int max){
        if (min <= max){
            this.min = min;
            this.max = max;
        }
        else{
            this.min= max;
            this.max= min;
        }
    }

}
