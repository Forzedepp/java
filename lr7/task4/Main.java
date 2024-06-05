package lr7.task4;

public class Main {
    public static void main(String[] args) {
        SuperClass character = new SuperClass('A');
        System.out.println(character);
        SubClass text = new SubClass('A',"text");
        System.out.println(text);
        SubOfSubClass number = new SubOfSubClass('A',"text",12);
        System.out.println(number);
    }
}
