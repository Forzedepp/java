package lr13.Examples;

public class example8 {
    public static int m() {
        try {
            System.out.println("0");

        } finally {
            System.out.println("1");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(m());
    }

}
