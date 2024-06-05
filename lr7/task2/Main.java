package lr7.task2;

public class Main {
    public static void main(String[] args) {
        SuperClass nulltext = new SuperClass();
        System.out.println("Длина строки: "+nulltext.getLength());
        SuperClass Supertext = new SuperClass("Присутствующего");
        System.out.println("Длина строки: "+Supertext.getLength());

        SuperClass number = new SubClass(777);
        System.out.println(number);
        SuperClass textAndNumber = new SubClass("Слова", 777);
        System.out.println(textAndNumber);
        SuperClass noText = new SubClass();
        System.out.println(noText);
    }
}
