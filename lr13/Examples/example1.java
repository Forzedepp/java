package lr13.Examples;

public class example1 {
    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        }catch (RuntimeException e){
            System.out.println("1 " + e);
        }
        System.out.println("2");
    }
}
