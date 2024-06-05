package lr5;

public class task4 {
    int value;
    char symbol;

    public task4 (char symbol, int value){
        this.symbol= symbol;
        this.value= value;
    }
    public task4(double doub){
        this.symbol = (char) ((int)doub);
        double a = doub - ((int)doub);
        this.value=(int) (a * 100);

    }

    public static void main(String[] args) {
        task4 a = new task4('A',12);
        System.out.println("Символ из примера: "+ a.symbol + " Значение из примера: "+ a.value);
        task4 b = new task4(70.1512);
        System.out.println("Символ: "+ b.symbol + " Значение: "+ b.value);
    }


}
