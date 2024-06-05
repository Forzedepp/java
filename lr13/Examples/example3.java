package lr13.Examples;

public class example3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2 " + e);
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");

    }
}
