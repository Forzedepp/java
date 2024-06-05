package lr5;
public class task2 {
    public char a = 'A';
    public char b = 'Z';

    public void output(){
        for (char i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        task2 letters = new task2();
        letters.output();
    }
}
