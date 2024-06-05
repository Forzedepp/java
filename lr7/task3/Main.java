package lr7.task3;

public class Main {
    public static void main(String[] args) {
        SuperClass number = new SuperClass(1);
        System.out.println(number);
        SubClass word = new SubClass(1,'A');
        System.out.println(word);
        SubOfSubClass text = new SubOfSubClass(1,'F',"Text");
        System.out.println(text);


    }


}
