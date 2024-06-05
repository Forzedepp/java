package lr5;

public class task1 {
    private char charact;

    public void letter(char a){
        charact = a;
    }
    public int symbol(){
        return (int) charact;
    }
    public void sout(){
        System.out.println("Символ: " + charact);
        System.out.println("Код символа: "+ (int) charact);
    }

    public static void main(String[] args) {
        task1 charr = new task1();
        charr.letter('C');
        charr.symbol();
        charr.sout();
    }

}
