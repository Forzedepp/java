package lr7.task5;

public class Main {
    public static void main(String[] args) {
        SuperClass text = new SuperClass("text");
        text.printLine();
        SubClass number = new SubClass("text",12);
        number.subPrintLine();
        SubOfSuperClass character = new SubOfSuperClass("text",'A');
        character.subPrintLine();
    }

}
