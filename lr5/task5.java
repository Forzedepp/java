package lr5;

import java.util.Scanner;

public class task5 {
    private int value;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение ");
        int value = in.nextInt();
        if(value >= 100){
            value= 100;
        }
        task5 set = new task5();
        set.setValue(0);
        System.out.println("Нулевое значение: "+ set.getValue());
        set.setValue(value);
        System.out.println("Измененное значение: "+ set.getValue());
    }
    public task5(){
        this.value= 0;
    }
    public task5(int value){
        if(value >= 100){
            this.value= 100;
        }
        else{
            this.value= value;
        }
    }
    public void setValue(int value){
        if(value >= 100){
            this.value= 100;
        }
        else{
            this.value= value;
        }
    }
    public int getValue(){
        return this.value;
    }

}
