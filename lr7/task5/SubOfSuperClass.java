package lr7.task5;

public class SubOfSuperClass extends SuperClass {
    protected char character;

    SubOfSuperClass(String text, char characterInput){
        super(text);
        putCharacter(characterInput);
    }
    public void putCharacter(char characterInput){
        character = characterInput;
    }

    public void subPrintLine(){
        System.out.println(this.getClass().getSimpleName() +  " text= " + text + " character= " + character);
    }

}
