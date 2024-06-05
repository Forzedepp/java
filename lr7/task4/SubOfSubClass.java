package lr7.task4;

public class SubOfSubClass extends SubClass {
    int number;

    SubOfSubClass(char character, String text, int numberInput){
        super(character, text);
        putNumber(numberInput);
    }
    public void putNumber(int numberInput){
        number = numberInput;
    }

    @Override
    public String toString() {
        return super.toString() + " number= " + number;
    }
    @Override
    public SubOfSubClass copy(){
        return new SubOfSubClass(character,text,number);
    }
}

